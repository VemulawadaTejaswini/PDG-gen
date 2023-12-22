import java.util.Scanner;

public class Main {
	public static Scanner sc;
	
	public static void main(String args[]){
		//System.out.println("Please input grades below");
		//宣言
		sc = new Scanner(System.in);
		int m[]= new int[500];
		int f[]= new int[500];
		int r[]= new int[500];
		int s[]= new int[500];
		int i=1;
		//入力
		for(;;) {
			m[i]=sc.nextInt();
			f[i]=sc.nextInt();
			r[i]=sc.nextInt();
			s[i]=m[i]+f[i];
			if(m[i]==-1 &&f[i]==-1 &&r[i]==-1) {
				break;
			}
			i++;
		}
		i=1;
		
		//出力
		for(;;) {
			if(m[i]==-1 &&f[i]==-1 &&r[i]==-1) {
				break;
			}
			//System.out.println(s[i]);
			if(m[i]==-1 ||f[i]==-1) {
				System.out.println("F");
			}else if(s[i]>=80) {
				System.out.println("A");
			}else if(s[i]>=65 && s[i]<80) {
				System.out.println("B");
			}else if(s[i]>=50 && s[i]<65) {
				System.out.println("C");
			}else if(s[i]>=30 && s[i]<50) {
				if(r[i]>=50) {
					System.out.println("C");
				}else {
					System.out.println("D");
				}
			}else {System.out.println("F");
			}
			i++;
		}
	}
}
