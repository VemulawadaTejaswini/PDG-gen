import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       Scanner scan= new Scanner(System.in);

        for(int i=0;;i++){
            int H=scan.nextInt();
            int W=scan.nextInt();
            if(W==0 && H==0){
                break;
            }

            for(int j=0;j<H;j++) {
                for (int k = 0; k < W; k++) {
                    if(j==0 || j==H-1){
                        System.out.print("#");
                    }else {
                        if(k==0 || k==W-1){
                            System.out.print("#");
                        }else{
                            System.out.print(".");
                        }
                    }

                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

