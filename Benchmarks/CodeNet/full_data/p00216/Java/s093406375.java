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
		void fase_1(){
			now=1150;
			if(w>10){
				w-=10;
			}else w=0;
		}
		
		void fase_2(){
			if(w<=0)return;
			if(w>10){
				w-=10;
				now+=(125*10);
			}else if(w<=10){
				now+=(125*w);
				w=0;
			}
		}
		
		void fase_3(){
			if(w<=0)return;
			if(w>10){
				w-=10;
				now+=(140*10);
			}else if(w<=10){
				now+=(140*w);
				w=0;
			}
		}
		
		void fase_4(){
			if(w<=0)return;
			now+=(160*w);
			w=0;
		}
		
		public AOJ0216() {
			int before = 4280;
			while(true){
				w = in.nextInt();
				if(w==-1)break;
				fase_1();fase_2();fase_3();fase_4();
				System.out.println(before-now);
			}
		}

	}
}