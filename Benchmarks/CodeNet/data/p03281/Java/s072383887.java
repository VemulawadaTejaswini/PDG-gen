import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int n = scn.nextInt();
        if(n<105){
            System.out.println(0);
        }else{
            int answer=1;
            for(int i= 107;i<=n;i++){
                if(i/2==0) continue;
                int cnt=0;
                for(int j=1;j<=i;j+=2){
                    if(i/j==0) cnt++;
                }
                if(cnt==8) answer++;
            }
            System.out.println(answer);
        }
    }
}
