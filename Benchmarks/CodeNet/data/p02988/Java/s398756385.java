import java.util.Scanner;
public class Main1 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int n=t.nextInt(), cont=0;
		int p[] = new int[n];
		for(int i=0; i < n; i++) {
			p[i] = t.nextInt();
		}
		for(int i=1; i < n-1; i++) {
		if(p[i-1] < p[i] & p[i] > p[i+1]) {
			cont += i;
		}
		}
		System.out.println(cont);
	
	}

}