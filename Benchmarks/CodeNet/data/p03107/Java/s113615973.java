import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		String s = sc.next();
		char a[] = new char[s.length() + 1];
		for (int i = 0; i <= s.length() - 1; i++) {
			a[i + 1] = s.charAt(i);
		}
		int ka = s.length() - 1;


		for (int i = 1; i <= ka; i++) {
			if (a[i] != 'p') {
				for (int j = i + 1; j <= ka+1; j++) {
					if (a[j] != 'p' && a[j] == a[i]) {
						a[i] = 'p';
						a[j] = 'p';
						i = 1;
						n++;
					}else if(a[j] != 'p' && a[j] != a[i]){
j=ka+9;
					}
				}
			}
		}

		System.out.println(n*2);
	}

}