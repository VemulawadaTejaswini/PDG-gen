import java.util.*;


public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = new String(sc.next());
		
			System.out.println(1-str.indexOf('A')+str.lastIndexOf('Z'));
			
		sc.close();
	}
}