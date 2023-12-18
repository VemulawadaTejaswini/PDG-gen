import java.util.Scanner;

public class Main {

	public static void main(String args[]){
		Scanner cin = new Scanner(System.in);
		long target = cin.nextLong();
		cin.close();

		long tmp = (long)target/11;
		long result;
		if(target==tmp*11){
			result = tmp;
		}else if(target-tmp*11<=6){
			result = tmp+1;
		}else{
			result = tmp+2;
		}

		System.out.println(result);
	}
}
