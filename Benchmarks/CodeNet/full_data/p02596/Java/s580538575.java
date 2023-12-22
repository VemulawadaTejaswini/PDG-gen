import java.util.*;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int k = sc.nextInt();
        int seven = 7 % k;
        int temp = -1;
        int res = seven;
        boolean divisible = false;
        int count = 1;
        int past[] = new int[k];

        while (!contains(past, res)) {
            past[count-1] = res;
            temp = res;
            res = (res * 10) % k;
            res = (res + seven) % k;
            count++;
            if (res == 0) {
                divisible = true;
                break;
            }
        }

        if (divisible) {
            System.out.println(count);
        } else {
            System.out.println(-1);
        }
    }
    
    static boolean contains (int past[], int n) {
        boolean result = false;

        for (int i = 0; i < past.length; i++) {
            if (past[i] == n) {
                result = true;
                break;
            }
        }
        return result;
    }
}
