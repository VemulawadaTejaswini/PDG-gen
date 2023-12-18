import java.util.*;
public class Main {
    public static void main(String[] argas){
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();
        int [] A = new int[N];
        int [] price = new int[N];
        for(int a=0;a<N;a++){
            A[a] = sc.nextInt();
            price[a] =0;
        }
        for(int a=0;a<N;a++){
            for(int b=0;b<N+1;b++){
                if((b==0&&b!=a)){
                    price[a] += Math.abs(A[b]);
                }
                else if((b==N&&b!=a)&&(b-1!=a)){
                    price[a] += Math.abs(A[b-1]);
                }
                else if((b==N&&b!=a)&&(b-1==a)){
                    price[a] += Math.abs(A[b-2]);
                }
                else if(b!=a&&a!=b-1){
                    price[a] += Math.abs(A[b]-A[b-1]);
                }
                else if((b!=a&&a==b-1)&&(b>=2)){
                    price[a] += Math.abs(A[b]-A[b-2]);
                }
                else if(b!=a&&a==b-1){
                    price[a] += Math.abs(A[b]);
                }
            }
        }
        for(int a=0;a<N;a++){
            System.out.println(price[a]);
        }
    }
}
