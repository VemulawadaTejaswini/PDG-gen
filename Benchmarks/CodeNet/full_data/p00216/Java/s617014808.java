import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0216();
	}
	class AOJ0216{
		int now,w,set[];
		public AOJ0216() {
			int before = 4280;
			while(true){
				w = in.nextInt();
				if(w==-1)break;
				now = 1150;
				w-=10;
				switch ((w-1)/10){
				case 1:
					now+=(125*10);
					w-=10;
					now+=(140*w);
					break;
				case 2:
					now+=(125*10+140*10);
					w-=20;
					now+=(160*w);
					break;
				}
				if((w-1)/10>=3){
					now+=(125*10+140*10);
					w-=30;
					now+=(160*w);
				}
//				System.out.println(now);
				System.out.println(before-now);
			}
		}

	}
}