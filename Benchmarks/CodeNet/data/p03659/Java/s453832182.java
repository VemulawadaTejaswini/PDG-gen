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
		int r=111111110;
		
		for (int i=0;i<Integer.parseInt(s1[0]);i++){int x=0,y=0;
			for(int j=0;j<i;j++)x=x+i2[j];
			for(int j=i2.length;j>i;j--)y+=i2[j-1];
			System.out.println(x+":"+y+":"+r);
			if(Math.abs(x-y)<r&&x!=0&&y!=0)r=Math.abs(x-y);
		}
		
		System.out.println(r);
	}
}