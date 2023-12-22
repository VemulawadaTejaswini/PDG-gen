import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int make = sc.nextInt();
        int max = sc.nextInt();
        int time = sc.nextInt();
        int ans = (max / make) + (max % make == 0 ? 0 : 1) * time;


        System.out.println(ans);

    }
}