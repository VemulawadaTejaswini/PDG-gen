import java.util.*;
import java.io.*;
//import java.lang.Math;
public class Main {
	public static void main(String[] args){
		
		int sunuke = 0;
		int arai = 0;
		int Min,Min0=0;
		
		Scanner sc =new Scanner(System.in);
		String Ns = sc.nextLine();
		int N = Integer.parseInt(Ns);
		String[] a = new String[N];
		String line = sc.nextLine();
		a = line.split(" ");
		
		int[] ia = new int[N];
		for(int j =0;j<N;j++){
		ia[j] = Integer.parseInt(a[j]);}
		
		
		for(int i=0;i<N-1;i++){ 
			
			for(int j=0;j<=i;j++){sunuke = ia[j] + sunuke;}
			for(int k=N-1;k>i;k--){arai = ia[k] + arai;}
			
			int sa = Math.abs(sunuke-arai);
			if(i==0){Min0 = sa;}
			Min = Math.min(Min0,sa);
			//if(Min==sa){Indexi = i;Indexj = j;}
			Min0 = Min;
			
			sunuke = 0;
			arai = 0;
		}System.out.println(Min0);
		
	}
}