
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;
import java.util.Scanner;

public class Main
{
	public static void main (String[] arg)throws IOException 
	{
		String ln ="";
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		while((ln=input.readLine()) != null){
			int count=2;
			int num = Integer.parseInt(ln);
			boolean Prime=false;
			for(int i=5;i <= num; i +=2){
				for(int j=2;j*j<=i;j++){
					if(i%j==0){
						Prime=false;	
						break;
					}
					Prime=true;
				}
				if(Prime){
					count++;
				}
			}
			System.out.println(count);
		}
	}
}