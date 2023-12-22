import java.util.Scanner;

public class Main{
    public static void main(String[]argc){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        for(int k=0;;k++){
            if(H==0&&W==0) break;        }
            for(int i=0;i<H;i++){
                for(int j=0;j<W;j++){
                    if(i==0||i==H-1||j==0||j==W-1){
                        System.out.printf("#");
                    }else{
                        System.out.printf(".");
                    }
                }
                System.out.printf("\n");
            }
            System.out.printf("\n");
        }
    }



