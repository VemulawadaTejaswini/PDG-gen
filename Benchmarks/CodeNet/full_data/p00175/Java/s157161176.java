import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        new Main().run();
    }
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == -1){
				break;
			}
			String ans = "";
			while(true){
				ans = n%4 + ans;
				n /= 4;
				if(n == 0){
					break;
				}
			}
			System.out.println(ans);
		}
	}
}