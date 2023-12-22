import java.util.Scanner;
public class main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = 0;
		int a[] = new int[n], b[] = new int[n],c[] = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();			
		}
		for(int i = 0; i < n; i++){
			if(a[i]<b[i]){
				m = a[i];
				a[i] = b[i];
				b[i] = m;
			} else {
				if(a[i]<c[i]){
					m = a[i];
					a[i] = c[i];
					c[i] = m;
				}
			}
		if(a[i]*a[i] == b[i]*b[i] + c[i]*c[i]){
			System.out.println("Yes");
		} else {
			System.out.println("No");
			}
		}
	}
}