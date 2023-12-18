import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner as = new Scanner(System.in);
		String n = as.next();

		String[] strArray = n.split("");

		int pcount = 0;
		int m = Integer.parseInt(n);



		for(int i=0;i<strArray.length;i++) {
			int tmp = Integer.parseInt(strArray[i]);

			pcount += tmp;
		}

		if(m%pcount == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}