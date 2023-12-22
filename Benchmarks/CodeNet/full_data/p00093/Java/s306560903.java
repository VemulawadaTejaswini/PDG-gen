import java.util.*;
import static java.lang.Math.*;
import java.io.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		for(int count=0;;count++){
			int a=sc.nextInt(),b=sc.nextInt();
			if(a==0&&b==0)break;
			boolean judge=false;
			if(count!=0)System.out.println();
			for(int i=0;i<=b-a;i++){
				int temp=a+i;
				if(temp%4==0&&temp%100!=0||temp%400==0){
					System.out.println(temp);
					judge=true;
				}
			}
			if(!judge){
				System.out.println("NA");
			}
			count++;
		}
		out.flush();
	}
}