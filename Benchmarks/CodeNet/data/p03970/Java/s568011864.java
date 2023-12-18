import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String s=sc.next();
			String r="CODEFESTIVAL2016";
			int ans=0;
			for(int i=0;i<r.length();i++) if(s.charAt(i)!=r.charAt(i)) ans++;
			System.out.println(ans);


			/*
			 * CODEFESTIVAL2016
			 */
		}
	}
}