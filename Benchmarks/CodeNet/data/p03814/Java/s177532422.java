import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		int ans=0;
		for(int i=0;i<n.length();i++) {
			if(n.charAt(i)=='A') {
				if(i!=0) {
					n.substring(i-1);
				}
				for(int j=0;j<n.length();j++) {
					if(n.charAt(j)=='Z') {
						ans=Math.max(ans, j-i+1);
					}
				}
			}
		}
		System.out.println(ans);
		sc.close();
	}
}