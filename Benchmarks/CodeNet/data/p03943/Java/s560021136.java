import java.util.Arrays;
import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int can[]=new int[3];
		for(int i=0;i<3;i++){
			can[i]=sc.nextInt();
		}
		Arrays.sort(can);
	    if(can[0]+can[1]==can[2])System.out.println("YES");
	    else System.out.println("NO");
		
	}

}