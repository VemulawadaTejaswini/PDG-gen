import java.lang.*;
import java.util.*;
import java.io.*;

public class Main
{
	public static void main (String[] arg)throws IOException
	{
		int month[]= new int[12];
		int days[]= {31,29,31,30,31,30,31,31,30,31,30,31};
		int mod=4;
		month[0]=mod;
		for (int i = 1 ; i <12;i++){
			month[i]=(mod+days[i-1]%7)%7;
			mod=month[i];
		}
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String line;
		StringTokenizer tokenizer1;
		int a[] = new int[2];
		while ((line = input.readLine()) != null && !line.isEmpty()) {
			tokenizer1 = new StringTokenizer(line);
			for(int i=0;i<2;i++){
				a[i]=Integer.parseInt(tokenizer1.nextToken());
			}
			if(a[0]==0){
				break;
			}
			output((month[a[0]-1]+a[1]-1)%7);
		}
	}
	
	public static void output(int a){
		switch (a){
		  case 1:
			System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;	
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
			System.out.println("Friday");
			break;
		  case 6:
			System.out.println("Saturday");
			break;
		  case 0:
			System.out.println("Sunday");
			break;
		}
	}
}	