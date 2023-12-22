import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- > 0){
			String str1 = new StringBuilder(sc.next()).reverse().toString();
			String str2 = new StringBuilder(sc.next()).reverse().toString();
			int maxlen = Math.max(str1.length(), str2.length());
			if(maxlen >80){
				System.out.println("overflow");
				return;
			}
			int [] ans = new int [maxlen+1];
			int len = str1.length();
			for(int i=0; i < len; i++){
				ans[i] = str1.charAt(i) - '0';
			}
			len = str2.length();
			for(int i=0; i < len; i++){
				ans[i] += str2.charAt(i) - '0';
			}
			System.out.println(ans.length);
			len= ans.length - 1 ;
			for(int i=0; i < len; i++){
				if(ans[i] >= 10){
					ans[i+1]++;
					ans[i] = ans[i] - 10;
				}
			}

			if(ans.length == 81 && ans[80] == 1){
				System.out.println("overflow");
			}
			else{
				if(ans[len] == 1){
					System.out.print(1);
				}
				for(int i=ans.length-2; i >= 0; i--){
					System.out.print(ans[i]);
				}
				System.out.println("");
			}
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}
}