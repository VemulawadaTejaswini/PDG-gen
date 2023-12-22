import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int A[]=new int[3];
		for(int i=0;i<3;i++) A[i]=Integer.parseInt(in.next());
		
		int max=A[0], min=A[0];
		for(int i=1;i<3;i++) {
			if(max<A[i])max=A[i];
			if(min>A[i])min=A[i];
		}
		
		System.out.println(min+" "+max);
	}

}

