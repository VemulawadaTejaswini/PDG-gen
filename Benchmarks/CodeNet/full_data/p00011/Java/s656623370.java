
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main
{
	public static void main (String[] arg)throws IOException
	{
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		int[] a= new int[31];
		int[] b= new int[31];	
		int num = Integer.parseInt(input.readLine());
		int num2 = Integer.parseInt(input.readLine());
		for(int i=0;i<=30;i++){
           a[i]=i;
		}
		
		String[] change;
		for(int j=1;j<=num2;j++){
		change=input.readLine().split(",");
		int x1 = Integer.parseInt(change[0]);
        int y1 = Integer.parseInt(change[1]);
		int buffer;
		buffer=a[x1];
		a[x1]=a[y1];
		a[y1]=buffer;
		}
		for(int k=1;k<=num;k++){
			System.out.println(a[k]);
		}
	}
}