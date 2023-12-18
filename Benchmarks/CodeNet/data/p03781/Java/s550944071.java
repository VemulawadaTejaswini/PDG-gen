import static java.lang.System.*;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner s = new Scanner(in);
		
		int goal = s.nextInt();
		
		out.println(length(0,goal,0));
	}
	
	public static int length(int time, int goal, int p) {
		if(p==goal)
			return time-1;
		
		if(time>=goal)
			return goal;
		
		int a = length(time+1,goal,p+time);
		int b = length(time+1,goal,p);
		int c = length(time+1,goal,p-time);
		
		int yes = (int)(Math.min(a,Math.min(b,c)));
		
		return yes;
	}
}