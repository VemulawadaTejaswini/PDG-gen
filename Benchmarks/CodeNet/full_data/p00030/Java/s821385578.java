import java.util.*;
//SHAKYO
public class Main {
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int s = sc.nextInt();
			if((n|s) == 0) break;
			int res = s - n;
			if(n == 1){
				System.out.println(1);
			}
			else if(res < 0 || n <= 0){
				System.out.println(0);
			}
			else{
				System.out.println(res);
			}
			
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}