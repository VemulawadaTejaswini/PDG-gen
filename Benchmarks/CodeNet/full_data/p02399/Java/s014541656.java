import java.util.Scanner;                                                   
class Main {
 
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
                int a = in.nextInt();
                int b = in.nextInt();
                double d = (double)a/(double)b;
                System.out.println((a / b)  + " " + (a % b) + " " + string.format("%.5d", d));
        }
}