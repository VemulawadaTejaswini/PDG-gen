import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		Stack<Integer> s = new Stack<Integer>();
		while(in.hasNextInt()){
			int t=in.nextInt();
			if(t==0){
				System.out.println(s.pop());
			}else{
				s.push(t);
			}
		}
		while(!s.empty())System.out.println(s.pop());
	}
}