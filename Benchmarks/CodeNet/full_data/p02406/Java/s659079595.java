import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int a =1;a<=n;a++){
			String s = String.valueOf(a);
			if(a%3 == 0){
				System.out.print(" "+a);
			}else{
				int t = s.indexOf("3");
				if(t != -1){
					System.out.print(" "+a);
				}
			}
		}
		System.out.println("");
	}
}