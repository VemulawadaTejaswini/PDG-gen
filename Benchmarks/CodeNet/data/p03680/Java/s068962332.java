
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String line = br.readLine();
		Scanner scan = new Scanner(System.in);


	    int[] button = new int[1000000];
	    button[0] = scan.nextInt();
	    int count = 0;

	    for(int i=1;button[i]==0;i=i+0)
	    	if(button[i]!=0)
	    	{
	     		count++;
	     		if(button[i]==2)
	     			System.out.println(count);
	     		else
	     		{
	     			button[i]=0;
	    	continue;
	    	    }
	     		
	        }
	    	else
	    		System.out.println("-1");


	}
	
	}
	

