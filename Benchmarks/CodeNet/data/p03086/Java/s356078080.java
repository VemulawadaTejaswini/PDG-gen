import java.util.Scanner;

public class Main{
	static int ans = 0;
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		//int n=sc.nextInt();
		String s=sc.next();
		int count=0;
		//String put="";
		for(int i=0;i<s.length();i++) {
			if(s.substring(i, i+1).equals("A")||s.substring(i, i+1).equals("C")||s.substring(i, i+1).equals("G")||s.substring(i, i+1).equals("T")) {
				count++;
				ans=Math.max(ans, count);
			}else {
				count=0;
			}
		}


		System.out.println(ans);
	}
}
