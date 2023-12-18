import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		int flg=0;
		String ans;
		for(int i=0;i<3;i++){
			if(a.charAt(i)==b.charAt(2-i)) flg++;
		}
		if(flg==3) ans="YES";
		else ans="NO";

		System.out.println(ans);
	} 
}