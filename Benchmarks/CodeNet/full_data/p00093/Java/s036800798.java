import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		boolean first = true;
		while(true){
			int a = cin.nextInt();
			int b = cin.nextInt();
			if(a+b==0){
				break;
			}
			if(!first){
				System.out.println();
			}
			first=false;
			boolean isNA = true;
			for(int i = a+1;i < b;i++){
				if(uruu(i)){
					System.out.println(i);
					isNA = false;
				}
			}
			if(isNA){
				System.out.println("NA");
			}
		}

	}
	static boolean uruu(int a){
		if(a%400==0){
			return true;
		}
		else if(a%100==0){
			return false;
		}
		else if(a%4==0){
			return true;
		}
		else{
			return false;
		}
	}
}