import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int area=1;
		int length=0;
		while(scan.hasNext()){
			
			int num = scan.nextInt();
			area*=num;
			length+=num*2;
		}
		System.out.println(area+" "+length);
	}
}