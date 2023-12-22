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
        List<Integer> past = new ArrayList<Integer>();

        while (!past.contains(res)) {
            past.add(res);
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
        } else if (k == 1 || k == 7) {
            System.out.println(1);
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
            if (past[i] == 0) {
                break;
            }
        }
        return result;
    }
}
