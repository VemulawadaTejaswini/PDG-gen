import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner std = new Scanner(System.in);
		while(true){
			String x = std.next();
			int ans = 0;
			if(x.equals("0")){
				break;
			}else{
				for(int i=0; i<x.length(); i++){
					ans += Integer.parseInt(String.valueOf(x.charAt(i)));
				}
			}
			System.out.println(ans);
		}
	}
}