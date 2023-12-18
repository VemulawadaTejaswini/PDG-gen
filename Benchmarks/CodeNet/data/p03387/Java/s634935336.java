import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] map = new int[3];
		map[0] = sc.nextInt();
		map[1] = sc.nextInt();
		map[2] = sc.nextInt();
		
		Arrays.sort(map);
		
		int sub = map[2] - map[0];
		sub += map[2] - map[1];
		
		if (sub % 2 == 0) {
			System.out.println(sub / 2);
		} else {
			System.out.println((sub + 1) / 2 + 1);
		}
	}
	
}