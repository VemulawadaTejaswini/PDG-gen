import java.util.Scanner;
public class Main {
	static int t;
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(System.in);
		
		while(true){
			String[] s = sc2.nextLine().split("");
			Main.t=0;
			if(s[1].equals("0"))break;
			else{
				for(String s1: s){
					if(!s1.equals("")){
						int x = Integer.parseInt(s1);
						Main.total(x);
					}
				}
				System.out.println(Main.t);
			}
		}
	}
	public static void total(int i){
		Main.t += i;
	}
}