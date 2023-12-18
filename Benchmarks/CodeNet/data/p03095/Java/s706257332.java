import java.util.Scanner;
public class Main{
	public static void main(String[]args){
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	String b=scan.next();
	int ans=1;
	int alpha[]={1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
	for(int i=0;i<b.length();i++) {
		char ch=b.charAt(i);
		alpha[ch-'a']++;
	}
	for(int i=0;i<26;i++) {
		ans*=alpha[i]%1000000007;
	}
	System.out.println(ans-1);
	scan.close();
	}
}