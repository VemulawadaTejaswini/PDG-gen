import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int i,j;
        while(true){
            int H = sc.nextInt();
            int W = sc.nextInt();
            if(H==0&&W==0){
                break;
            }
            for(i=0;i<H;i++){
                for(j=0;j<W;j++){
                    if((i+j)%2==0)System.out.printf("#");
                    else System.out.printf(".");
                }
                System.out.println();
            }
         System.out.println();
        }
    }
}

