import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        
        String[] spline = line.split(" ");
        int a = Integer.parseInt(spline[0]);
        int b = Integer.parseInt(spline[1]);
        System.out.println(a*b);
    }
}
