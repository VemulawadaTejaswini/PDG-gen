import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(i == 0){
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a==0){
				if(b==0){
					break;
				}
			}
	
			int[] d = {a,b};
			Arrays.sort(d);
			System.out.println(d[0]+" "+d[1]);
		}
	}
}