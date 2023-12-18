import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int possible = (B/A);
        int numTimesOpt = (C < (possible)) ? C: possible;  
      System.out.println(possible);
        System.out.println(numTimesOpt);
    }

}
