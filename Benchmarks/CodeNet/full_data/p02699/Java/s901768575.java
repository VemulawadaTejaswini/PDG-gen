import java.util.Scanner;
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int sheep = sc.nextInt();
		int wolves = sc.nextInt();

		if(sheep > wolves){
			System.out.print("safe");
		}else{
			System.out.print("unsafe");
		}

	return;

	}
}
