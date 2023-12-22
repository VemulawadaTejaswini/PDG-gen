import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        String input = stdIn.nextLine();
        int d = Integer.parseInt(input.split(" ")[0]);
        int t = Integer.parseInt(input.split(" ")[1]);
        int s = Integer.parseInt(input.split(" ")[2]);

        if(d <= (t * s)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
