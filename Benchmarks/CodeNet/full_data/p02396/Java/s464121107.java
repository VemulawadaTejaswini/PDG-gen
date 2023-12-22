import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        int inputednum;
        
        while(true) {
            inputednum = sc.nextInt();
            
            if(inputednum == 0) {
                break;
            }
            else {
                System.out.println(++i + inputednum);
            }
        }
    }
}
