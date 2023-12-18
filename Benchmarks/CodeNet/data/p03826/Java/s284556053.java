import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int N,re,ans=0;
        String S;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        S = sc.next();
        for(int i=0;i<N;i++){
            if(S.indexOf("I",i)!=0){
                ans = ans + 1;
            }
            else if(S.indexOf("D",i)!=0){
                ans = ans - 1;
            }
        }
        System.out.println(ans);
    }
}