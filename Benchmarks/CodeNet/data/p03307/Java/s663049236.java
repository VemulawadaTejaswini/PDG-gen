import java.util.*

public class Main {
	public static void main(String args[]) {
 		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int min = 0;
        int num = 0;
        for(int i=0;i<n;i++) {
        num = sc.nextInt();
        max = Math.max(max, num);
        min = Math.min(min, num);
        }
        
        System.out.println(max - min);
    }
}