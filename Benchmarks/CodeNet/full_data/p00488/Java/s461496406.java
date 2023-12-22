import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] pasta=new int[3];
		int[] drink=new int[2];
		pasta[0]=sc.nextInt();
		pasta[1]=sc.nextInt();
		pasta[2]=sc.nextInt();
		drink[0]=sc.nextInt();
		drink[1]=sc.nextInt();
		Arrays.sort(pasta);
		Arrays.sort(drink);
		System.out.println(pasta[0]+drink[0]-50);
		sc.close();
	}
}