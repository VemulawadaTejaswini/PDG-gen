import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long num = 100;
        long index = 1;
        while (true) {
        	long r = num/100;
        	num += r;
        	if (X <= num) {
        		break;
        	}
        	index++;
        }
        System.out.println(index);
    }
}