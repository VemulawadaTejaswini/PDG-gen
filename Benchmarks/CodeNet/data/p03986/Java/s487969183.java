import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		String x=sc.next();
		StringBuffer sb=new StringBuffer(x);
		
		int i=0;
		while(i<sb.length()-1){
			if(sb.substring(i, i+2).equals("ST")){
				sb=sb.delete(i, i+2);
				i=0;
				continue;
			}
			i++;
		}
		System.out.println(sb.length());
	}
}
