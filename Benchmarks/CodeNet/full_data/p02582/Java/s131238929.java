import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		char[] d = sc.next().toCharArray();
		int count = 0;
		for(int i = 0; i < 3; i++) {
			if(d[i] == 'R')
			count++;
		}
		System.out.println(count);
    }
}