
import java.util.Scanner;

public class Main {
	public static void main(String[] args){ 
		Scanner sc=new Scanner(System.in);
		int z = sc.nextInt();
		int h[] =new int[z];
		for(int i=0;i<z;i++){
			h[i]=sc.nextInt();
		}
		for(int j=0;j<z;j++){
			if(j==0)System.out.println(""+h[0]);
			System.out.println(" "+h[z-(j+1)]);
		}
		sc.close();
		System.exit(0);
	}		
}