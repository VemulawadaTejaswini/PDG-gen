import java.util.*;
public class Main {
	public static void main(String[] agrs){
		Scanner x=new Scanner(System.in);
		int times=0;
		while(times<=200){
			int sum=0;
			String str =x.nextLine();
			String[] s = str.split(" ");
			int number1 = Integer.parseInt(s[0]);
			int number2 = Integer.parseInt(s[1]);
			if(number1>=0&&number1<=1000000&&number2>=0&&number2<=1000000){
				int n=(number1+number2);
				 while(n!=0){
					n=n/10;
					sum++;
				}
				 System.out.println(sum);
			}
			else break;
		}
		x.close();
 
	}
}