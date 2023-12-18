import java.util.Scanner;

public class Multiple_of_2_and_N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner br = new Scanner(System.in);
		int N = br.nextInt();
		for(int i=2;i<=(2*N);i=i+2)
		{
			if(i%N==0)
			{
				System.out.println(i);
				break;
			}
		}
		
	}

}
