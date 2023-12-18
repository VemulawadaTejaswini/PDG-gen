import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[]  input1 = s.nextLine().split(" ");
        //1taps
        int A = Integer.valueOf(input1[0]);
        //min count
        int B = Integer.valueOf(input1[1]);
        
        int ct = 0;
        int hole = 0;
        while(true) {
            ct++;
            hole += A-1;
            if (hole + 1 >= B) break;
        }
        System.out.println(ct);
    }
}