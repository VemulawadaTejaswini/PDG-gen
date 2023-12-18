import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int tako[] = new int[n];
        for (int i = 0; i < n; i++) {
            tako[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                sum += tako[i] * tako[j];
            }
        }

        System.out.println(sum);
	}
}
