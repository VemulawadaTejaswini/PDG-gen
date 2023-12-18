import java.util.*;

class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n[] = {sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()};
		Arrays.sort(n);
		boolean b= false;
		if(n[0]==1) {
			if(n[1]==4) {
				if(n[2]==7) {
					if(n[3]==9)System.out.println("YES");
					b=true;
				}
			}
			
		}
		if(b==false)System.out.println("NO");

	}
}
