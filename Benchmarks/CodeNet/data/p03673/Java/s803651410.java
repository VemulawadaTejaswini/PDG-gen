import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        int t = 0;
        
        for(int i=0; i<N; i++){
            a[i] = sc.nextInt();
            if(i!=0){
                for(int j=0; j<(i+1)/2; j++){
                    t = a[j];
                    a[j] = a[i-j];
                    a[i-j] = t;
                }
            }
        }
        for(int i=0; i<N-1; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(a[N-1]);
    }
}
