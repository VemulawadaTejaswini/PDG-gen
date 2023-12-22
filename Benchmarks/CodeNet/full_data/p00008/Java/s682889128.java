import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args)
			throws java.io.IOException{
		Scanner scan = new Scanner(System.in);
		int n;
		int ans =0;
		int m=0;
		while (scan.hasNext()){
			n=scan.nextInt();
		for(int i=0;i<10;i++)
			for(int j=0;j<10;j++)
				for(int k=0;k<10;k++)
					for(int l=0;l<10;l++)
						if(i+j+k+l == n)ans++;
						
		System.out.println(n);
		}
		
					}
						
	}