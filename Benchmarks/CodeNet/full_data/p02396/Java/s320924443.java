import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i = 0;
        int inputednum;

        while(true) {
            if((inputednum = Integer.parseInt(sc.next()))== 0) {
                break;
            }
            else {
                System.out.printf("Case %d: %d", ++i, inputednum);
            }
        }
    }
}

