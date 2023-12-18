import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0, pmax = 0;
		int n = sc.nextInt();
		int pos=0,flag=0;
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			max = Math.max(max, a[i]);
		}
		for (int i = 0; i < n; i++) {
			if(a[i]==max&&flag==0) {
			pos=i;
			flag=1;
			break;
			}
		}
		for (int i = 0; i < n; i++)if (i!=pos)pmax = Math.max(pmax, a[i]);
		int i;
		for (i = 0; i < n; i++) {
			if(pmax==max){
				System.out.println(max);
			}else  {
				if (max == a[i])System.out.println(pmax);
				else System.out.println(max);
			}  
		}
	}
}