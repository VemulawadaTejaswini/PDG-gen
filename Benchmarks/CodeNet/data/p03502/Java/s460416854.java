import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class Main extends Thread {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int a=sc.nextInt();
		int b=a;
		int sum=0;
		while(a!=0){
			sum+=a%10;
			a%=10;
		}
		if(b%sum==0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}