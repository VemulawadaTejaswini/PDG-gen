import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		for(;;){
		String x = scan.next();
		if(x.equals("0"))
			break;
		String b[] = x.split("");
		int i,m,ans;
		ans = 0;
		for(i = 0; i < x.length(); i++){
			for(m = 0; m <= 9; m++){
				Integer num = new Integer(m);
				String str2 = num.toString();
				if(b[i].equals(str2))
					ans += m;
			}
		}
		System.out.println(ans);
		}
		
	}
}