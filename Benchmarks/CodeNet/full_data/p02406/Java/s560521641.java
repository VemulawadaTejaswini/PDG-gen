import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		int flg = 0;
		
		System.out.print(" ");
		for(int i = 1;i <= b;i++){
			flg = 0;
			if((i % 3) == 0){
				System.out.print(i);
				flg = 1;
			}else if((i % 10) == 3&& flg != 1){
				System.out.print(i);
				flg = 1;
			}
			if(i != b && flg == 1)
				System.out.print(" ");
		}
		System.out.println();
	}

}