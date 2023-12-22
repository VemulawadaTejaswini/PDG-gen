import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        String Input = stdIn.nextLine();
        String inputs[] = Input.split(" ");
        int x = Integer.parseInt(inputs[0]);
        int y = Integer.parseInt(inputs[1]);

        if(x > 0 && x < 101 && y > 0 && y < 101){
            int result = x*y;
            System.out.println(result);
        }
    }
}
