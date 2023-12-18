import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
 
 
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		//int N = Integer.parseInt(sc.next());
		//int Q = Integer.parseInt(sc.next());
		//long L = Long.parseLong(sc.next());
		char[] c = sc.next().toCharArray();
		int count = c.length;
		int win = 0;
		for(char c_ : c){
			if (c_=='o')win++;
		}
		if(15-count >= 8-win){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		
		//System.out.println(ans);
		
		
		
	}
	
}

