import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		String x = sc.next();
		
		String a;
		String ans = "";
		
		for(int i=0; i<x.length(); i++){
			if((a = x.substring(i, i+1)).equals("B")){
				ans = ans.substring(0, ans.length()-1);
			}else{
				ans = ans + a;
			}
		}
		System.out.println(ans);

		sc.close();
	}
}
