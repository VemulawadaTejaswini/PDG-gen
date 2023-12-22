import java.util.Scanner;


public class Main {

	public static void main(String [] args) {

		Scanner sc = new Scanner(System.in);
long sum = 0;
String moji = "";
long kou = 0;


		while(true) {

			String i = sc.next();
			moji = i;
			
			if(moji.length() == 1) {
				if(Integer.parseInt(i) == 0)break;
			}

			
			
			 
			 
			 int len = moji.length();
			 
			 
			
			for(int k = 0;k < len;k++) {
				
				char ichi;
				
				
				ichi = moji.charAt(k);
				
				
				kou = Character.getNumericValue(ichi);
				
				sum = sum + kou;
				
				
				
			}
			
			System.out.println(sum);
			
			
			sum = 0;
			moji = "";
			kou = 0;
			

		}

		}



}

