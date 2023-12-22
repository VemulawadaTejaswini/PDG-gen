import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        int tem;
        int count = 0;
        for(i=1;i<=num;i++){
            if(i%3==0){
                System.out.print(" "+i);
                continue;
            }
            tem=i;
            for(count=0;tem>0;count++) {
                if(tem%10==3)System.out.print(" "+tem);
                tem /= 10;
            }
        }
    }
}
