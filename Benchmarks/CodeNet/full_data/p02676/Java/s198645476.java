//20200517 B
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k=sc.nextInt();
      	sc.nextLine();
		String s=sc.nextLine();
		int l=s.length();
		if(l<=k){
			System.out.println(s);
		}else{
			System.out.println(s.substring(0,k)+"...");
		}
	}
}
