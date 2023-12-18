import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int check = 0;
        int num1 = scan.nextInt();

        for(int i = 0; i < num1; i++){
            int num2 = scan.nextInt();

            if(num2 % 2 == 0){
                if(num2 % 3 != 0 && num2 % 5 != 0){
                    check = 1;
                }
            }
        }


        if(check == 0){
            System.out.println("APPROVED");
        }else{
            System.out.println("DENIED");
        }
    }
}
