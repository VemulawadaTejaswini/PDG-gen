import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
         int i = 1;
        while(true) {
            int num = src.nextInt();
            
            if(num == 0){
                break;
            }else {
                System.out.println("Case "+i + ": "+  num );
                i += 1;
            }
        }
    }
}
