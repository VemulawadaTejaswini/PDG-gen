import java.util.*;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		for(int i=0; i<5; i++){
			int A = sc.nextInt();
			if(A==0){
				System.out.println(i+1);
				return;
			}
		}

		System.out.println("0");
		return;
	}
}