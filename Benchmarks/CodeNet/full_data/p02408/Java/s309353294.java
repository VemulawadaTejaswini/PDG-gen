import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int cards[][] = new int[4][52];
		String mark = "";
		int num = 0;
		for(int i = 0;i < count;i++)
		{
			mark = scan.next();
			num = scan.nextInt();
			if(mark.equals("S")){
				cards[0][num - 1] = 1;
			}else if(mark.equals("H")){
				cards[1][num - 1] = 1;
			}else if(mark.equals("C")){
				cards[2][num - 1] = 1;
			}else if(mark.equals("D")){
				cards[3][num - 1] = 1;
			}
		}
		
		for(int i = 0;i < 4;i++)
		{
			for(int j = 0;j < 13;j++)
			{
				if(cards[i][j] == 0){
					switch(i)
					{
						case 0:
							System.out.printf("S %d\n", j + 1);
							break;
						case 1:
							System.out.printf("H %d\n", j + 1);
							break;
						case 2:
							System.out.printf("C %d\n", j + 1);
							break;
						case 3:
							System.out.printf("D %d\n", j + 1);
							break;
						default:
							System.out.println("error");
							break;
					}
				}
			}
		}
	}
}