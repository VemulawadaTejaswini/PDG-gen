import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Main main = new Main();
        main.main();
    }
    int[] factorial;
    boolean[] flag;
    int n;
    void main(){
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        int[] p = new int[n+1];
        int[] q = new int[n+1];
        for(int i = 1; i<=n ; i++){
            p[i] = sc.nextInt();
        }
        for(int i = 1; i<=n ; i++){
            q[i] = sc.nextInt();
        }
        factorial = new int[n+1];
        factorial[0] = 1;
        for(int i = 1; i<=n ; i++){
            factorial[i] = i* factorial[i-1];
        }
        flag= new boolean[n+1];
        int rankP = rank(p);
        int rankQ = rank(q);
        System.out.println(Math.abs(rankP - rankQ));
    }

    int rank(int[] array){
        for( int i=0; i <=n; i++){
            flag[i]= false;
        }
        int rank=0;
        for(int j=1; j<=n; j++) {
            int counter=0;
            for (int i = 1; i <= array[j]; i++) {
                if (flag[i] == false) {
                    counter++;
                }
            }
            rank += factorial[j-1]*counter;
            flag[array[j]]= true;
        }
        return rank;
    }
}