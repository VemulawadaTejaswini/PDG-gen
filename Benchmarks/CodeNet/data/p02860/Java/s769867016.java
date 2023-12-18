import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input1 = Integer.parseInt(sc.nextLine());
        String input2 = sc.nextLine();

        if (input1%2 == 0){
            if (input2.substring(0, input1/2-1).equals(input2.substring(input1/2, input1-1))) {
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }else{
            System.out.println("No");
        }
    }

}
