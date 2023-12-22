import java.util.*;
import java.math.*;
import java.text.*;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0; i<t; i++){
			int n = in.nextInt();
			int a=in.nextInt(), b=0, up=0, down=0;
			for(int j=0; j<n-1; j++){
				b=in.nextInt();
				if((b-a)>0){
					if((b-a)>up) up = (b-a);
				}
				else if((b-a)<0){
					if((a-b)>down) down = (a-b);
				}
				a = b;
			}
			System.out.println(up+" "+down);
		}
	}
}