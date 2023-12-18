import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int counta=0;
		int countb=0;
		for(int i=0; i<3; i++){
			if(s.charAt(i)=='A'){
				counta++;
			}else{
				countb++;
			}
		}
		if(counta==3 || countb==3){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}
	}
}
