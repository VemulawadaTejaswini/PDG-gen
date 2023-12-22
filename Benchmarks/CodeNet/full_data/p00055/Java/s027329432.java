import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        while(in.hasNextDouble()){
            double a = in.nextDouble();
            System.out.println(a * 633 / 81);
        }
    }
}

