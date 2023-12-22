import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int H = scan.nextInt();
        int W = scan.nextInt();
        if(H != 0 && W != 0){
            for(int i = 1; i <= W; i++){
                for(int j = 1; j <= H; j++){
                    System.out.println("#");
                }
            }
        }else{
            return;
        }
    }  
}