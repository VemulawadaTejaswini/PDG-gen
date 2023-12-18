import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long N = scan.nextLong();
        long M = scan.nextLong();
        long ans = 0;
        if(N>=3 && M>=3){
            ans = (N-2)*(M-2);
        }else if(N==1 || M==1){
            if(N==1 && M==1)ans=1;
            else if(N==1)ans = M-2;
            else if(M==1)ans = N-2;
        }
        System.out.println(ans);
    }
}