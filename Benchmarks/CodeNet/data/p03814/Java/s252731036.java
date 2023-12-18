import java.util.Scanner;

public class Main {
	private static Scanner sc=new Scanner(System.in);
	private static String line=sc.next();
	private static int start,end;
	public static void main(String[] args){
		char[] c=line.toCharArray();
		lab1:for(int i=0;i<=c.length-1;i++){
			if(c[i]=='A'){
				start=i;
				break lab1;
			}
		}
		lab2:for(int i=c.length-1;i>=0;i--){
			if(c[i]=='Z'){
				end=i;
				break lab2;
			}
		}
		int ans=end-start+1;
		System.out.println(ans);
	}
}