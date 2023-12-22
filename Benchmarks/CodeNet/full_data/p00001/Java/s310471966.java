import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static void main(String args[])throws Exception{
		Scanner sc = new Scanner(System.in);
		Integer[] mount = new Integer[10];
		int i = 0;
		while(i != 10){
			mount[i] = sc.nextInt();
			i++;
		}
		sc.close();
		Arrays.sort(mount);
		i = i-1;
		for(;i >= 7;i--){
		System.out.println(mount[i]);
		}
	}
}