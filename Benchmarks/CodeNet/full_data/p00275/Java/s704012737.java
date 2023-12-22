import java.util.*;
public class Main {
	public static void main(String[] args) {
		int place = 0;
		Scanner scan = new Scanner(System.in);
		while(true) {
			int n = scan.nextInt();
			if(n == 0) 	break;
			int[] entry =  new int[n];
			int x = 0;
			String f = scan.next();
			char[] data = f.toCharArray();
			for(int i = 0; i < 100; i++) {
				if(data[i] == 'M') {
					entry[x]++;
				} else if(data[i] == 'S') {
					place = place + entry[x] + 1;
					entry[x] = 0;
				} else if(data[i] == 'L') {
					entry[x] = place + entry[x] + 1;
					place = 0;
				}
				if(x + 1 == n) {
					x = 0;
				} else {
					x++;
				}
				Arrays.sort(entry);
			}
			for(int i = 0 ; i < n; i++) {
				System.out.print(entry[i] + " ");
			}
			System.out.println(place);
		}
		
	}
}