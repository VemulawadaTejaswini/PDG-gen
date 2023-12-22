import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args)throws IOException{
		String a;
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		a=buf.readLine();
		int x=Integer.parseInt(a);
	//	if(x/3600<10)System.out.print("0");
		System.out.print(x/3600);
		System.out.print(":");
		int y;
		int g=x;
		g=g/60;
		while(true){
			if(g>=60){
				g-=60;
				
			}else{
				break;
			}
			
		}
	//	if(g<10)System.out.print("0");
		System.out.print(g);
		System.out.print(":");
		while(true){
			if(x>=60){
				x-=60;
			}else{
				break;
			}
		}
	//	if(x<10)System.out.print("0");
		System.out.println(x);
		
	}

}