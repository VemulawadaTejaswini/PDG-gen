import java.io.*;
import java.util.*;

public class Main {
	public static void main (String args[]){
		Scanner sc=new Scanner(new InputStreamReader(System.in));
		int i=0,x;
		while(true){
			i++;
			x=sc.nextInt();
			if(x==0) break;
			System.out.println("Case "+i+": "+x);
		}
	sc.close();
	}
}