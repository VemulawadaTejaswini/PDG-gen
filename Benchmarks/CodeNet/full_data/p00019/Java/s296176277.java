import java.util.Scanner;

public class Main{
	public Main(){
		Scanner sc = new Scanner(System.in);
		int tmp = 0;
		while(sc.hasNext()){
		if(tmp != 0) System.out.println();
		int n = sc.nextInt();
		int t = 1;
		
		while(n > 1){
			t *= n--;
		}
		
		System.out.print(t);
		tmp = 1;
		}
	}

	public static void main(String[] args){
		Main test = new Main();
	}
}