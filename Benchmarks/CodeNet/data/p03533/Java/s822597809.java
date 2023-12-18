import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		s = s.replaceAll("A", "");
		
		if(s.equals("KIHBR")){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		
		sc.close();
	}
	
}
