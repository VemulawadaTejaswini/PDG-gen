import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws IOException{
		int count_5=0,count_7=0;
		Scanner scan =new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
			int num=scan.nextInt();
			if(num==5) count_5++;
			if(num==7) count_7++;
		}

		if(count_5==2 && count_7==1) System.out.println("YES");
		else System.out.println("NO");

	}
}