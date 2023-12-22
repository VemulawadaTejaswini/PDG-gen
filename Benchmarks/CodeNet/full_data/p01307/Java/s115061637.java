import java.util.Scanner;

public class Main{
	Main(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int k = 0; k < n; k++){
			String str = sc.next(), st;
			boolean f = false;
			int l = str.length();
			while(l > 1){
				if(l > 2){
					st = str.substring(0, l-2);
				} else {
					st = "";
				}
				int s = Integer.parseInt(str.substring(l-2, l-1));
				int t = Integer.parseInt(str.substring(l-1, l));
				str = st + Integer.toString(s+t);
				l = str.length();
				f = !f;
			}
			if(f){
				str = "Fabre wins.";
			} else {
				str = "Audrey wins.";
			}
			System.out.println(str);
		}
	}
	
	public static void main(String[] args){
		new Main();
	}
}