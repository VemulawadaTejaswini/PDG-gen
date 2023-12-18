import java.io.*;
public class HInaArare{
	public static void main() throws IOException{
		int  i = (int)System.in.read(),sum=0;
		int[] fin = new int[4];  
		char[] a = new char[i];
		char[] check = {'P','W','G','Y'};
		for(int j=0; j<i; j++) {
			a[i]=(char)System.in.read();
		}
		for(int j=0; j<check.length; j++) {
			for(int k=0; k<a.length; k++) {
				if(a[k]==check[j]) {
					fin[j]=1;
				}
			}
		}
		for(int m=0; m<check.length; m++) {
			if(fin[m]==1) {
				sum++;
			}
		}
		if(sum>3) {
			System.out.println("Four");
		}else {
			System.out.println("Three");
		}
		
		
		
	}
}
