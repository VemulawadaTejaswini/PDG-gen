import java.util.Scanner;

public class ABD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int times;
		times = in.nextInt();
		if(times>1 && times<=999){
			System.out.println("ABC");
		}else if(times<=1998){
			System.out.println("ABD");
		}
	}

}
