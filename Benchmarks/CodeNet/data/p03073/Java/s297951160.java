
import java.util.*;
import java.io.*;

class C {

	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		
		char[] arr = s.next().toCharArray();
		int l = arr.length;
		char[] A = new char[l];
		char[] B = new char[l];
		int c=0,d = 0;
		for(int i = 0;i<l;i++)
		{
			A[i] = i%2==0?'0':'1';
			B[i] = i%2==0?'1':'0';
			if(A[i]!=arr[i])c++;
			if(B[i]!=arr[i])d++;
		}System.out.println(Math.min(c,d));
		
	}
	
}
