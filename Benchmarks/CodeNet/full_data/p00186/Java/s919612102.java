import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        new Main().run();
    }
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int q1 = scan.nextInt();
			if(q1 == 0){
				break;
			}
			int b = scan.nextInt();
			int c1 = scan.nextInt();
			int c2 = scan.nextInt();
			int q2 = scan.nextInt();
			if(b < c1){
				System.out.println("NA");
				continue;
			}
			int x = b / c1;
			int y = 0;
			boolean fl = true;
			x = (x > q2)?q2:x;
			for(int i = x;i > 0;i--){
				if(i*c1 > b){
					continue;
				}
				y = (b-i*c1)/c2;
				if(i+y >= q1){
					System.out.println(i + " " + y);
					fl = false;
					break;
				}
			}
			if(fl){
				System.out.println("NA");
			}
		}
	}
}