import java.util.Scanner;
public class Main {
	static int ans;
	public static void bottom(int n[]){
		int c[]=new int[n.length-1];
		int i;
		
		for(i=0;i+1<n.length;i++){
			c[i]=n[i]+n[i+1];
			if(c[i]>9){
				c[i]=c[i]%10;
			}
		}
		if(c.length==1){
			ans=c[0];
			return;
		}
		else bottom(c);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n[]=new int[10];
		int i;
		String str;
		char ch[]=new char[10];
		while(sc.hasNext()){
			str=sc.next();
			ch=str.toCharArray();
			for(i=0;i<10;i++){
				n[i]=ch[i]-'0';
			}
			bottom(n);
			System.out.println(ans);
		}
	}
}