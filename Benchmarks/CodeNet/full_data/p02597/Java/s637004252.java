import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String c = sc.next();
        char[] color = new char[n];
        for(int i = 0; i < n; i++) {
            color[i] = c.charAt(i);
		}
		int count = 0;
		if((color[0] == 'W') && (color[n - 1] == 'R')){
			color[0] = 'R';
			color[n - 1] = 'W';
			count++;
		}
		for(int j = 0; j < n - 1; j++) {
			if((color[j] == 'W') && (color[j + 1] == 'R')){
			color[j + 1] = 'W';
			count++;
			}
		}
		System.out.println(count);
    }
}