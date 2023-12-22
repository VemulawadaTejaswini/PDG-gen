import java.util.Scanner;

public class Main {
	static int l;
	static int f(int[] a,char d,int k) {		//数字と演算子を送って計算
		int sum = 0;
		int n = 0;
		boolean isMul = false;
		if(d=='*') {
			sum = 1;
			isMul = true;
		}
		for(int aa:a) {
			if(isMul) sum *= aa;
			else sum += aa;
			n++;
			if(n==k)break;
		}
		return sum;
	}
	
	static int parse(int j,String[] str) {
//		for(String a:str) {
//			System.out.print(a);
//		}
//		System.out.println();
		int[] put = new int[20];
		int k = 0;
		String ns = "";
		
		
		char d = str[0].charAt(j);
		int c = 0;
		for(String s:str) {
			if(str[0].equals(s))
				continue;
			if(Character.isDigit(s.charAt(j+1))) {
				put[k] = Integer.parseInt(String.valueOf(s.charAt(j+1)));
				k++;
			}
			else {
				if(c==0)
					ns = s;
				else
					ns = ns + ":" + s;
				c++;
			}
		}
		String[] s = ns.split(":");
		if(ns!="") {
			if(d=='+')
				return f(put,d,k)+parse(j+1,s);
			return f(put,d,k)*parse(j+1,s);
		}
		return f(put,d,k);							//すべて同じ次数のとき
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			if(n==0)break;
			String[] str = new String[n];
			for(int i=0;i<n;i++) {
				str[i] = sc.next();
			}
			
			if(n>1)
				System.out.println(parse(0,str));
			else
				System.out.println(str[0]);
		}
	}
}
