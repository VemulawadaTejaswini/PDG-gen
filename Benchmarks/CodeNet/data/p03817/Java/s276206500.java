import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long x = in.nextLong();
        long result = 1;
        if (x == 1) {
        	System.out.println(0);
        	return;
        }
        if (x < 7) {
        	System.out.println(result);
        	return;
        }
        x = x-1;
        
        result = result + (x/11)*2;
        if (x%11 > 6) result+=2;
        else if (x%11 == 0) {}
        else result++;
        System.out.println(result);
    }
}