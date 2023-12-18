import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        int S = scan.nextInt();
        if(N==K){
            for(int i=0;i<N;i++){
                System.out.print(S);
                System.out.print(" ");
            }
        }else{
            int p = S%2;
            int q = S/2;
            for(int i=0;i<K;i++){
                int a = 0;
                if(i%2==0 && p==1)a++;
                System.out.print(q+a);
                System.out.print(" ");
            }
            for(int i=0;i<N-K;i++){
                System.out.print(q*2+2);
                System.out.print(" ");
            }
        }
    }
}
