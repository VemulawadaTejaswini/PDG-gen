import java.io.*;
import java.util.*;
import java.util.stream.Stream;
public class Main {
	public static Scanner stdIn = new Scanner(System.in);
	public static void main(String[] args){
		String L1 = stdIn.nextLine();
		String L2 = stdIn.nextLine();
		String[] s1 = L1.split(" ", 0);
		String[] s2 = L2.split(" ", 0);
		long[] i2 = Stream.of(s2).mapToLong(Long::parseLong).toArray();
		long r=2000000001;
		int n=Integer.parseInt(s1[0]);
		long x=0,y=0;
		int i=0;
		for (i=0;i<n;i++){
			y+=i2[i];
		}
		for (i=0;i<n-1;i++){
			x=x+i2[i];
			y=y-i2[i];
			if(Math.abs(x-y)<r&&x!=0&&y!=0){
				r=Math.abs(x-y);
			}
		}
		System.out.println(r);
	}
}