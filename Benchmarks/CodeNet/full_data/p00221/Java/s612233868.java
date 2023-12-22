import java.util.Scanner;

public class Main {
	static boolean check(String [] say,int i) {
		if(i%3==0 && i%5!=0){
			if(say[i].equals("Fizz")) return true;
			else return false;
		}
		if(i%3!=0 && i%5==0){
			if(say[i].equals("Buzz")) return true;
			else return false;
		}
		if(i%3==0 && i%5==0){
			if(say[i].equals("FizzBuzz")) return true;
			else return false;
		}
		else {
			String s = say[i];
			if(s.charAt(0)-'0'==i) return true;
			else return false;
		}
	}
	
	static int order(int [] member,int j,int m) {
		if(member[j%m]==0) return j%m;
		else return order(member,j+1,m);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			if(m==0 && n==0) break;
			String [] say = new String[n+1];
			int [] member = new int[m];
			for(int i=1;i<=n;i++) {
				say[i] = sc.next();
			}
			for(int i=0;i<m;i++) {
				member[i] = 0;
			}
			for(int i=1,j=1;i<=n;i++) {
				j=order(member,j,m);
				if(!check(say,i)) member[j]=1;
				j++;
			}
			for(int j=1;j<=m;j++) {
				if(member[j%m]==0) {
					System.out.print(j);
				}
			}
			System.out.println();
		}

	}
	
}

