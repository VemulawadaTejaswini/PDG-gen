import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static final Scanner s=new Scanner(System.in);
	static int getInt(){
		return Integer.parseInt(s.next());
	}
	public static void main(String[] __){
		int n=getInt();
		String a=s.next(),b=s.next();
		for(int i=0;i<n;i++) {
			String r=a.substring(i,n);
			if(b.startsWith(r)) {
				System.out.println((a+b.replaceFirst(r,"")).length());
				return;
			}
		}
		System.out.println((a+b).length());
	}
}
