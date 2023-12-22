import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String s;
		int one;
		int five;
		int ten;
		int oturi;
		int p;
		int q;
		try{
			while((s=reader.readLine()) != null){
				String[] t=s.split(" ");
				int x=Integer.parseInt(t[0]);
				int y=Integer.parseInt(t[1]);
				if(x==0 && y==0){
					break;
				}
				oturi=y-x;
				if(oturi/1000 ==0){
					if(oturi/500 ==0){
						one=oturi/100;
						five=0;
						ten=0;
					}else{
						five=oturi/500;
						q=oturi-five*500;
						one=q/100;
						ten=0;
					}
				}else{
					ten=oturi/1000;
					p=oturi-ten*1000;
					five=p/500;
					q=p-five*500;
					one=q/100;
				}
				System.out.print(one+" "+five+" "+ten);
				System.out.println("");
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}
}