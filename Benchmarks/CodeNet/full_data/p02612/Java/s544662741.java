import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int n=input.nextInt();
		int back,i,j=1;
		while(true)
		{
			i=j*1000;
			if(i>=n)
			{
				back=i-n;
				break;
			}
			j++;
			
		}
	      System.out.println(back);

	}

}
