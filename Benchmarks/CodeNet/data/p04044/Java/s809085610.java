import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	int n = sca.nextInt();
	int l = sca.nextInt();
	String[] str = new String[n];
	for(int i = 0; i < n; i++) {
		str[i] = sca.next();
	}

	char min;
	for(int k = 0; k < n; k++) {
		for(int j = 0; j < l; j++) {
			min = 'z';
			for(int i = 0; i < n; i++) {
				if(str[i] == null) {
					continue;
				}
				if(str[i].charAt(j) < min) {
					min = str[i].charAt(j);
				}
			}
			int num = 0;
			int temp = 0;
			for(int i = 0; i < n; i++) {
				if(str[i] == null) {
					continue;
				}
				if(min == str[i].charAt(j)) {
					num++;
					temp = i;
				}
			}
			if(num == 1 || j == l-1) {
				System.out.print(str[temp]);
				str[temp] = null;
				j = l;
			}
			else {
				continue;
			}
		}
	}
	System.out.println("");
	sca.close();
	}
}