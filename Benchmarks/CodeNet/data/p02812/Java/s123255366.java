import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        String ABC = "ABC";
        String XNX = "X" + S + "X";
        System.out.println((XNX.split(ABC).length)-1);
    }
}