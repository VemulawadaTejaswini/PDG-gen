import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
		public static void main(String args[]) throws IOException{
			Scanner scan = new Scanner(System.in);
			char[] buf = new char[20];

			int n1,n2;
			while(scan.hasNext()){
				String str1 = scan.next();
				buf = str1.toCharArray();
			}
			for(int i = buf.length-1;i>=0;i--){
				System.out.print(buf[i]);
			}
			System.out.print("\n");
	}
}