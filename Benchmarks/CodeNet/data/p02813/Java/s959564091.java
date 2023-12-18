import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int[] p = new int[n];
        int[] q = new int[n];
        for(int i=0; i<n; i++){
            p[i] = stdIn.nextInt();
        }
        for(int i=0; i<n; i++){
            q[i] = stdIn.nextInt();
        }

        Permutation permP = new Permutation(p);
        Permutation permQ = new Permutation(q);

        int counterP = 0;
        while(true){
            counterP++;
            if(isSameArray(p, permP.getPerm())){
                break;
            }
            permP.next();
        }

        int counterQ = 0;
        while(true){
            counterQ++;
            System.out.println(Arrays.toString(permQ.getPerm()));
            if(isSameArray(q, permQ.getPerm())){
                break;
            }
            permQ.next();
        }

        System.out.println(Math.abs(counterP - counterQ));
    }

    static boolean isSameArray(int[] a, int[] b){
        for(int i=0; i<a.length; i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
}

class Permutation{
    int[] seed;
    int[] perm;

    public Permutation(int [] seed){
        this.seed = new int[seed.length];
        for(int i=0; i<this.seed.length; i++){
            this.seed[i] = seed[i];
        }

        this.perm = new int[seed.length];
        for(int i=0; i<this.perm.length; i++){
            this.perm[i] = seed[i];
        }
        sort(this.perm, 0, this.perm.length);
    }

    public int[] getPerm(){
        return this.perm;
    }

    public boolean next(){
        for(int i=perm.length-1; i>0; i--){
            if(perm[i] > perm[i-1]){
                changePerm(i);
                return true;
            }
        }

        return false;
    }

    private void changePerm(int index){
        int targetIndex = index;
        int min = Integer.MAX_VALUE;
        for(int i=index; i<perm.length; i++){
            if(min > perm[i] && perm[index-1] < perm[i]){
                min = perm[i];
                targetIndex = i;
            }
        }

        int temp = perm[index - 1];
        perm[index - 1] = perm[targetIndex];
        perm[targetIndex] = temp;

        sort(perm, index, perm.length);
    }

    private void sort(int[] a, int from, int to){
        for(int i=from; i<to; i++){
            int x = a[i];
            int j = i;
            while(j > from && a[j-1] > x){
                a[j] = a[j-1];
                j--;
            }
            perm[j] = x;
        }
    }
}
