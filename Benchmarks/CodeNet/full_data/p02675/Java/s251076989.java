import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] list = new int[String.valueOf( N ).length()]; 
        for (int i= 0;i < String.valueOf( N ).length();i++) {
            list[i] = N % 10;
            N /= 10;
        }
        int a = list[0];
        String b = null;
        if (a == 2 || a == 4 || a == 5 || a == 7 || a == 9) {
            b = "hon";
        } else if (a == 0 || a == 1 || a == 6 || a == 8){
            b = "pon";
        } else {
            b = "bon";
        }
        System.out.println(b);
    }
}