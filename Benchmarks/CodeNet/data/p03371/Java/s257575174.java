import java.util.Scanner;

import static java.lang.Math.*;

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
            int Apizza=max(0,X-i/2);
            int Bpizza=max(0,Y-i/2);
                    ans=Math.min(ans,Apizza*A+Bpizza*B+ABpizza*C);
        }
        System.out.println(ans);
    }

}