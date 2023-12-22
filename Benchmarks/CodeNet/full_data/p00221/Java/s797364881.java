package icpc;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int m = sc.nextInt(); //現メンバー数
			int f = m;				//初期メンバー数
			int n = sc.nextInt();
			if(m+n == 0)break;
			
			int[]  memnum = new int[m+1];
			for(int i=1;i<=m;i++) {
				memnum[i] = 1;
			}
			
			for(int i=1;i<=n;i++) {
				String num = sc.next();
				if(num.length()==1 && i%3!=0 && i%5!=0)continue;
				String ans = anssearch(i);
				if(!num.equals(ans)) {
					if(i%f==0)memnum[f] = 0;
					else memnum[i%f] = 0;
					m--;
				}
				if(m==1)break;
			}
			
			printall(memnum,f);
		}
	}
	
	private static String anssearch(int i) {
		String ans = "";
		if(i%3==0 && i%5==0) ans = "FizzBuzz";
		else if(i%3 == 0) ans = "Fizz";
		else if(i%5 == 0) ans =  "Buzz";
		return ans;
	}
	private static void printall(int a[],int m) {
		int cnt = 0;
			for(int i=1;i<=m;i++) {
				if(a[i] == 1) {
					if(cnt == 0) {
						System.out.print(""+i);
						cnt++;	
					}
					else System.out.print(" "+i);
				}
			}
			System.out.println("");
	}
}

