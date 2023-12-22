import java.util.*;
import java.awt.Rectangle;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		while(n-- > 0){
			Rectangle r = new Rectangle(sc.nextInt()-1,sc.nextInt()-1,sc.nextInt()+2,sc.nextInt()+2);
			int ans=0,m=sc.nextInt();
			while(m-- > 0)if(r.contains(sc.nextInt(), sc.nextInt()))ans++;
			System.out.println(ans);
		}
	}
}