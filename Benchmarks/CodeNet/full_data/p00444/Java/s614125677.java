import java.util.Scanner;

public class Main{
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);

			while(true){			
			int val = s.nextInt();
				
				if(val==0)
				break;
			
			int change = 1000-val;
			int count = 0;
			
			count += change/500;
			change = change%500;
			
			count += change/100;
			change = change%100;
			
			count += change/50;
			change = change%50;
			
			count += change/10;
			change = change%10;
			
			count += change/5;
			change = change%5;
			
			count += change/1;
			change = change%1;
			
			System.out.println(count);
			}
		}
}