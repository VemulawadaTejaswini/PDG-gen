import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int i;
        int[] a = new int[n];
        for(i=0; i<n; i++)
            a[i] = stdIn.nextInt();

        for(i=1; i<n-1; i++){
            int j, v;
            v = a[i];
            j = i-1;
            while(j>=0 && a[j]>v){
                a[j+1] = a[j];
                j--;
                a[j+1] = v;
            }
            for(int k=0; k<n; k++) System.out.print(a[k]+ " ");
            System.out.println();
    }
}