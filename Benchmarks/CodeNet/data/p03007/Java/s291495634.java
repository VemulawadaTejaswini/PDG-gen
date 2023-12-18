import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] a = new int[N];
        long sum = 0;
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
            sum += a[i];
        }
        sc.close();

        Arrays.sort(a);
        System.out.println(sum-2*a[0]);
        int xy = a[0];
        for(int i = 0; i < N-1; i++){
            if(i != N-2){
                System.out.print(xy + " " + a[i+1]);
                System.out.println();
                xy = a[i] - a[i+1];
            } else {
                System.out.print(a[i+1] + " " + xy);
                System.out.println();
            }
        }
    }
}