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
		int[] i2 = Stream.of(s2).mapToInt(Integer::parseInt).toArray();
		int r=10000000;
		int x=0,y=0,i=0;
		for (i=0;i<Integer.parseInt(s1[0]);i++){
			y+=i2[i];
		}
		for (i=0;i<Integer.parseInt(s1[0])-1;i++){
			x=x+i2[i];
			y=y-i2[i];
			if(Math.abs(x-y)<r){
				r=Math.abs(x-y);
			}
		}
		System.out.println(r);
	}
}