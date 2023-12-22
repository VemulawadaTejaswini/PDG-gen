import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		 new B().doIt();
	}
	
	class B{
		void doIt(){
			int n = in.nextInt();
			int input[] = new int[n];
			for(int i=0;i<n;i++)input[i] = in.nextInt();
			ArrayList<Integer> list = new ArrayList<Integer>();
//			list.add(input[1]-input[0]);
			for(int i=0;i<n-1;i++){
				int num = input[i+1]-input[i];
				if(i == 0 || list.get(list.size()-1)!=num)list.add(num);
			}
//			System.out.println(list);
			
			int kubo = 0;
			int sanp = 0;
			int mine = 0;
			int kougen = 0;
			int bon = 0;
			for(int i=0;i<list.size()-1;i++){
				int a = list.get(i);
				int b = list.get(i+1);
				if(a<0 && b>0)kubo++;
				else if(a>0 && b<0)mine++;
			}
			
			for(int i=0;i<list.size()-2;i++){
				int a = list.get(i);
				int b = list.get(i+1);
				int c = list.get(i+2);
				if(a<0 && b == 0 && c<0)sanp++;
				if(a>0 && b == 0 && c>0)sanp++;
				if(a>0 && b == 0 && c<0)kougen++;
				if(a<0 && b == 0 && c>0)bon++;
			}
			System.out.println(kougen+" "+bon + " " + sanp +" "+mine +" "+kubo);
			
		}
	}
	
}
