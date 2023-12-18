import java.util.Scanner;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num_1=sc.nextInt();
		int num_2=sc.nextInt();
		
		if(num_1*num_2%2==0){
			System.out.println("Even");
			System.out.println("As "+num_1+"×"+num_2+"="+num_1*num_2+" is even, print Even.");
		}else{
			System.out.println("Odd");
			System.out.println("As "+num_1+"×"+num_2+"="+num_1*num_2+" is odd, print Odd.");
		}
	}

}
