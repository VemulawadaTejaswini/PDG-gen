import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Integer a = in.nextInt();
		String b = a.toString();
		
		for(int i=1; i<n; i++){
			a = in.nextInt();
			
			if(n%2==0){
				if(i%2==1){
					b = a + " " + b;
				}else{
					b = b + " " + a;
				}
			}else{
				if(i%2==0){
					b = a + " " + b;
				}else{
					b = b + " " + a;
				}
			}
		}
		System.out.println(b);		
	}
}