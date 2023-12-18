import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int[] a = new int[N];
        int t = 0;
        int f = 0;

        for(int i=0; i<N; i++){
            a[i] = sc.nextInt();
            if(a[i]==2){
                t += 1;
            }
            if(a[i]%4==0){
                f += 1;
            }
        }
        if(t<=1){
            if(f>=N/2){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        else{
            N = N - t;
            if(N%2==0){
                if(f>=N/2){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
            else{
                if(f>=N/2+1){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
        }
    }
}