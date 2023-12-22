import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		if(n%2==1){
			for(int i=1; i<=m; i++){
				System.out.println(i+" "+(n+1-i));
			}
		}else{
			int i=1;
			for(; i<=m-1; i++){
				System.out.println(i+" "+(n+1-i));
			}
			System.out.println((i+2)+" "+(n+1-i-2));
		}
	}
}