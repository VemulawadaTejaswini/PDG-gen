import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		for(int i =0;;i++){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
			if(n==0){
				break;
			}else{
				System.out.println("Case "+ (i+1) +": "+n );
			}
		}
	}

}