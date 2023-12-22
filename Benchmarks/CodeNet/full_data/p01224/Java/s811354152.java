import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		new Main().run();
	}
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			int s = 0;
			for(int i = 1;i < n;i++){
				if(n%i == 0){
					s += i;
				}
			}
			if(n == s){
				System.out.println("perfect number");
			}else if(n > s){
				System.out.println("deficient number");
			}else{
				System.out.println("abundand number");
			}
		}
	}
}