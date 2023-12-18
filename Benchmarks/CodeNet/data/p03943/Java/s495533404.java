import java.util.*;
public class Main {
	private static Scanner sc;
	public static void main(String[] args){
		int goukei = 0;
		sc = new Scanner(System.in);
		goukei = goukei + sc.nextInt();
		goukei = goukei + sc.nextInt();
		goukei = goukei + sc.nextInt();
		if(goukei % 3 == 0){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}		
	}
}