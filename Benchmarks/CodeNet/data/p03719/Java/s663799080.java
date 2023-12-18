import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

import org.omg.Messaging.SyncScopeHelper;

public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){
		new Test_100().doIt();
	}
	class Test_100{
		void doIt() {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			if(C <= B && C >= A)System.out.println("Yes");
			else System.out.println("No");
		}
	}
}
