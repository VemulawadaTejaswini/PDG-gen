import java.util.*;
class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args){
		int m,r;
		while (s.hasNext()) {
			m = Integer.parseInt(s.next()) + Integer.parseInt(s.next());
			r = Integer.parseInt(s.next());

			if(m+r==-3)
				return;

			if(m>=80)
				System.out.println("A");
			else if(m>=65)
				System.out.println("B");
			else if(m>=50)
				System.out.println("C");
			else if(m>=30) {
				if(r>=50)
					System.out.println("C");
				else
					System.out.println("D");
			}else
				System.out.println("F");
		}
	}
}