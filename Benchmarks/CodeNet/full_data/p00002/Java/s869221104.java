import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int[] keta = new int[200];
		
		while(sc.hasNextInt()){
			keta[i] = sc.nextInt();
			keta[i+1] =sc.nextInt();
			System.out.println(String.valueOf(keta[i]+keta[i+1]).length());
			i = i+2;
		}
		sc.close();
	}
}