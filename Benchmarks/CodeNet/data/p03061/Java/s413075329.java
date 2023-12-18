import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b[]=new int[a];
		int max=0;
		for(int i=0;i<a;i++) {
			b[i]=scan.nextInt();
			if(max<b[i]) {
				max=b[i];
			}
		}
		int co=0;
		loop:for(int i=max;;i--) {
			for(int j=0;j<a;j++) {
				if(b[j]%i!=0) {
					co++;
				}
				if(co==2) {
					co=0;
					continue loop;
				}
			}
			System.out.println(i);
			return;
		}
	}
}