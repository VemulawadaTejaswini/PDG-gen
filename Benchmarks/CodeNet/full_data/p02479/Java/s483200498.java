import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double r = scan.nextInt();

        System.out.println(Math.PI * Math.pow(r, 2) + " " + 2 * Math.PI * r);
    }
}