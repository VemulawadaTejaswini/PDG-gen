import java.util.*;
import static java.lang.Math.*;
import java.io.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		while(sc.hasNext()) {
			int count=0;
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(a==0&&b==0)break;
			boolean judge=false;
			if(count!=0)out.println();
			for(int i=0;i<b-a;i++){
				int temp=a+i;
				if(temp%4==0&&temp%100!=0||temp%400==0){
					out.println(temp);
					judge=true;
				}
			}
			if(!judge)out.println("NA");
			count++;
		}
		out.flush();
	}
}