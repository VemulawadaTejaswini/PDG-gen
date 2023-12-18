
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int s = sc.nextInt();
		int c=0;
		int x,y,z;
		for(x=0;x<=k;x++) {
			for(y=0;y<=k;y++) {
				for(z=0;z<=k;z++) {
					if(x+y+z==s)c++;
				}
			}
		}
		System.out.println(c);
	}
}