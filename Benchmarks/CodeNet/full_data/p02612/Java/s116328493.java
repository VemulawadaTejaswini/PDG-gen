import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int[] arr = new int[4];
        while (t-- > 0) {
            String s = sc.next();
            if (s.equals("AC")) {
                arr[0]++;
            } else if (s.equals("WA")) {
                arr[1]++;
            } else if (s.equals("TLE")) {
                arr[2]++;
            } else {
                arr[3]++;
            }
        }
        
        System.out.println("AC X " + arr[0]);
        System.out.println("WA X " + arr[1]);
        System.out.println("TLE X " + arr[2]);
        System.out.println("RE X " + arr[3]);
 
    }
}