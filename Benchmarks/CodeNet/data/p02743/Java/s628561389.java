import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double culcLeft = Math.sqrt(a) + Math.sqrt(b);
        double culcRight = Math.sqrt(c);

        if (culcLeft < culcRight) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}