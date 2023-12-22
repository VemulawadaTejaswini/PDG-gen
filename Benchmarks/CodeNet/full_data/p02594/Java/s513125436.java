import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()){
            int n = in.nextInt();
            if(n>=30) System.out.println("yes");
            else System.out.println("no");
        }
        in.close();
    }
}