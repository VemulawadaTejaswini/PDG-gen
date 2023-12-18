import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        int A,B,C,X,Y;
        A=scanner.nextInt();
        B=scanner.nextInt();
        C=scanner.nextInt();
        X=scanner.nextInt();
        Y=scanner.nextInt();
        int ans=(int)1e9;//1e9=10^9
        for(int i=0;i<2*(X+Y)+1;i++){
            int ABpizza=i;
            int Apizza=Math.max(0,X-ABpizza/2);
            int Bpizza=Math.max(0,Y-ABpizza/2);
            ans=Math.min(ans,Apizza*A+Bpizza*B+ABpizza*C);
        }
        System.out.println(ans);
    }
}
