import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String s = sc.next();
		String[] line = s.split("");
        int count = 0;
        int countB = 0;
        int countW = 0;
        int i = 0;
        while(i<num){
          if(line[i].equals("#")) countB++;
          else countW++;
          i++;
        }
		System.out.println(countB <= countW ? countB : countW);
	}
}
