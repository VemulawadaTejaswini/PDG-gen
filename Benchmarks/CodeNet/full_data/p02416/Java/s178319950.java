import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int box;
		int sum;
		int keta ;
		int minus;
		while(num != 0)
		{
			box = num;
			keta = 0;
			while(box >= 10)
			{
				box /= 10;
				keta++;
			}
			sum = 0;
			minus = 0;
			box = num;
			do{
				for(int i = 0;i < keta;i++)
				{
					box /= 10;
				}
				minus += box * Math.pow(10, keta);
				keta--;
				sum += box;
				box = num - minus;
			}while(keta > 0);
			sum += box;
			System.out.println(sum);
			num = scan.nextInt();
			box = num;
			sum = 0;
			keta = 0;
		}
	}
}