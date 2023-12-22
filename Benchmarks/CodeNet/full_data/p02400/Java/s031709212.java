import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double r = scan.nextDouble();
        
        double S = r * r * Math.PI;
        double R = 2 * r * Math.PI;

        String str = String.format("%.6f", S);
        String rstr = String.format("%.6f", R);
        System.out.println(str + " " + rstr);
    }
}