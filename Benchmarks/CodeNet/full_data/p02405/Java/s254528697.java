import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int H = sc.nextInt();
            int W = sc.nextInt();
            if(H==0&&W==0){
                break;
            }
            for(int i=0;i<W;i++){
                for(int j=0;j<H;j++){
                    if((i%2==1&&j%2==1)||(i%2==0&&j%2==0))System.out.print("#");
                    else System.out.print(".");
                }
                System.out.print("\n");
            }
        }
    }
}

