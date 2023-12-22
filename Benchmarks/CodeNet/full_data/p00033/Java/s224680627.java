import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int time = scan.nextInt();
		for(int i = 0; i < time; i++){
			boolean judge = true;
			int max1 = 0;
			int max2 = 0;
			int array[] = new int[10];
			for(int j = 0; j < 10; j++){
				array[j] = scan.nextInt();
			}
			for(int j = 0; j < 10; j++){
				if(max1 < array[j])
					max1 = array[j];
				else if(max2 < array[j])
					max2 = array[j];
				else judge = false;
			}
			if(judge)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}