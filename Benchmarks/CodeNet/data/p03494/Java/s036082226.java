import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];
        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
        }
        int ans = 0;
        while (isEven(b)) {
            ans++;
            b = divide(b);          
        }
		System.out.println(ans);
	}
    private static boolean isEven(int[] b) {
        for (int i = 0; i < b.length; i++) {
            if (b[i] % 2 == 1) {
                return false;
            }
        }
        return true;
    }
    private static int[] divide(int[] b) {
        for (int i = 0; i < b.length; i++) {
            b[i] /= 2; 
        }
        return b;
    }
}