import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 500;
        String line =  input.nextLine();
        String[] strings = line.split(" ");
        int x = Integer.parseInt(strings[0]);
        int y = Integer.parseInt(strings[1]);
        if(x*n>=y) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
