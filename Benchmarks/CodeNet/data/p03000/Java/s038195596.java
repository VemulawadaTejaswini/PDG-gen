import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
        int sum = 0;
        int temp = 0;
        int cnt = 1;
        for (int i = 0; i < n; i++) {
			temp = sc.nextInt();
            sum += temp;
            if (sum > x){
            	break;
            }
            cnt += 1;
        }
		
		System.out.println(cnt);
	}
}