import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        new Main().run();
    }
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int t = scan.nextInt();
			int e = scan.nextInt();
			int count = 0;
			int x;
			for(int i = 0;i < n;i++){
				x = scan.nextInt();
				for(int j = t-e;j <= t+e;j++){
					if(j%x == 0){
						count++;
						break;
					}
				}
			}
			System.out.println((count == 0)?-1:count);
		}
	}
}