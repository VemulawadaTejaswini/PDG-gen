import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String t = sc.next();
		int n = sc.nextInt();
		String[] list = new String[n];
		for(int i = 0; i < n; i++) {
			list[i] = sc.next();
		}
		int sum = 0;
		for(int i = 0; i < n; i++) {
			IN:for(int j = 0; j < list[i].length(); j++) {
				for(int k = 0; k < t.length(); k++) {
					if(list[i].charAt((j+k)%list[i].length()) != t.charAt(k)) {
						continue IN;
					}
				}
				sum++;
				break;
			}
		}
		System.out.println(sum);
		
		
		
		
		
		
	}
}