import java.util.Scanner;

class Main {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d = in.nextInt();
        int s = in.nextInt();
        int t = in.nextInt();
        if (d >= 1 && d <= 10000 && s >= 1 && s <= 10000 && t >= 1 && t <= 10000) {
            if ((s * t) == d) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        else{
            System.out.println("No");
        }
    }
 
}