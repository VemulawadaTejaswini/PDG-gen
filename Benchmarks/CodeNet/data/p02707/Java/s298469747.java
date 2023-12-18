import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String l = sc.nextLine();
		Integer N = Integer.valueOf(l);
		l = sc.nextLine();
		String[] arr = l.split(" ");
		
		Integer[] boss = new Integer[arr.length + 1];
		
		Integer count = 1;
		for(String s : arr) {
			boss[count] = Integer.valueOf(s);
			count++;
		}
		
		for (Integer i = 1; i <= N; i++) {
			count = 0;
			for (Integer j = i; j <= boss.length - 1; j++) {
				if(boss[j] != -1 && boss[j] == i) {
					boss[j] = -1;
					count++;
				}
			}
			System.out.println(count);
		}
		sc.close();
	}
}