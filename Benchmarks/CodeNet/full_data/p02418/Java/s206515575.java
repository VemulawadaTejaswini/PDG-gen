import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String p = sc.next();
		String ss = s+s;
		
		String[] sArray = ss.split(p);
		if(sArray.length>1 || p.equals(s)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}	
}