import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int H,W;
        Scanner sc = new Scanner(System.in);
        while(true){
            H = sc.nextInt();
            W = sc.nextInt();
            if(H == 0 && W == 0)break;
            for(int j=0;j<W;j++){
                System.out.printf("#");
            }
            System.out.println();

            for(int i=0;i<H-2;i++){
                System.out.printf("#");
                for(int j=0;j<W-2;j++){
                    System.out.printf(".");
                }
                System.out.printf("#");
                System.out.println();
            }

            for(int j=0;j<W;j++){
                System.out.printf("#");
            }
            System.out.println();
            System.out.println();
            
        }
    }
}
