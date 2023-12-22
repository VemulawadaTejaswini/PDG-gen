import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int N=sc.nextInt();
			if(N==0) {
				break;
			}
			if(N%1111==0) {
				pl("NA");
			}
			else if(N==6174) {
				pl(0);
			}
			else {
				int counter=0;
				while(N!=6174) {
					counter++;
					N=calc(N);
				}
				pl(counter);
			}
		}
	}
	public static int calc(int a) {
		int[] num=new int[10];
		int[] num2=new int[10];
		for(int i=0; i<4; i++) {
			num[a%10]++;
			num2[a%10]++;
			a/=10;
		}
		int L=0;
		int S=0;
		int tmp=9;
		while(true) {
			if(tmp==-1) {
				break;
			}
			else {
				if(num[tmp]==0) {
					tmp--;
				}
				else {
					num[tmp]--;
					L+=tmp;
					L*=10;
				}
			}
		}
		tmp=0;
		while(true) {
			if(tmp==10) {
				break;
			}
			else {
				if(num2[tmp]==0) {
					tmp++;
				}
				else {
					num2[tmp]--;
					S+=tmp;
					S*=10;
				}
			}
		}
		return L/10-S/10;
	}
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
}
