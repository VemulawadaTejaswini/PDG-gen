import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		int b = 0;
		int c, d;
		int cnt = 0;
		
		for(int i=0;i<a.length();i++){
			if(a.substring(i, i+1).compareTo("0")!=0){
				if(i!=0) b = Integer.valueOf(a.substring(0, i));
				c = Integer.valueOf(a.substring(i, a.length()));				
				d = b+c;
				if(d%2==0 && (d/2-b)>=0) cnt++;
			}
		}
		System.out.println(cnt);
	}	
}