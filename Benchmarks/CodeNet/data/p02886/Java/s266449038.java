import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
     	int s[] = new int[n];
		for(int i=0; i<n; i++) {
			s[i] = sc.nextInt();
		}
		int hp = 0;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				hp +=s[i]*s[j];
			}
		}
		System.out.println(hp);
	}
}