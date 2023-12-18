import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long h=sc.nextLong();
		long w=sc.nextLong();
		if(h==1 || w==1){
			System.out.println(1);
		}else{
			System.out.println((h*w+1)/2);
		}
	}
}
