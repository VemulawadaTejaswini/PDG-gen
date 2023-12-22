import java.util.Scanner;

class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        double pi = 3.141592653589;
        double area = (double)r * r * pi;
        double Circumference = (double)r * 2 * pi;
        
        System.out.println(String.format("%.6f", area) + " " + String.format("%.6f", Circumference));
    }
}
