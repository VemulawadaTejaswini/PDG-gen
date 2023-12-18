import java.util.*;

class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();

		int wid = 0;
		int heg = 0;

			wid = (Math.min(x1, x2) - Math.max(x1, x2));
			heg = (Math.min(y1, y2) - Math.max(y1, y2));

			if(x1 <= x2 && y1 >= y2){
				heg = Math.abs(heg);
			} else if(x1 <= x2 && y1<= y2){
				wid = Math.abs(wid);
			}

		System.out.print(x2 + heg + " ");
		System.out.print(y2 + wid + " ");
		System.out.print(x1 + heg + " ");
		System.out.println(y1 + wid);


	}
}