import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int A;
        int B;

        int ans=20;

        for(int i=1; i<N+1; i++){
            int a=0; //Ａの桁数
            int b=0; //Ｂの桁数
            int tmp;
            if(N%i == 0){
                A = i;
                B = N/A;
            }else{
                continue;
            }
            while(A>0){
                A = A/10;
                a++;
            }
            while(B>0){
                B = B/10;
                b++;
            }
            tmp = Math.max(a,b);
            ans = Math.min(ans,tmp);
        }
        System.out.println(ans);
    }
}