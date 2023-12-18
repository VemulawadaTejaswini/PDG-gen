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
        for(int i=0;i<X+1;i++){
            for(int j=0;j<Y+1;j++) {
                for(int k=0;k<2*(X+Y)+1;k++){
                    int Apizza=i;
                    int Bpizza=j;
                    int ABpizza=k;
                    if(Apizza+ABpizza/2>=X&&Bpizza+ABpizza/2>=Y){
                        ans=Math.min(ans,Apizza*A+Bpizza*B+ABpizza*C);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
