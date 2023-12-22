
import java.util.Scanner;

public class Main {
	static int primeNum(int[] arr)
	{
		int counter=arr.length;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=2; j<= Math.sqrt(arr[i]); j++)
			{				
				if(arr[i]%j==0)
				{					
					counter--;
					break;
				}				
			}			
		}
		return counter;
	}
	
	public static void main(String argv[]) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int intArray1[];    //declaring array
        intArray1 = new int[num1];  // allocating memory to array
        
     // accessing the numbers in the second line
        for (int i = 0; i < intArray1.length; i++){
        	intArray1[i] = in.nextInt();
        }
        System.out.println(primeNum(intArray1));
        in.close();
	}
}

