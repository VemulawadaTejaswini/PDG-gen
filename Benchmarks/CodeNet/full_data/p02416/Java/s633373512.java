import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n,ans;
		while(true){
			n=Math.abs(scan.nextInt());
			if(n==0) break;
			String num=Integer.toString(n);
			ans=0;
			for(int i=0;i<num.length();i++){
				ans+=(num.charAt(i)-48);
			}
			System.out.println(ans);
		}
		scan.close();
	}
}