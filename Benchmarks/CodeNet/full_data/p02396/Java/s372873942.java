import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		while(true){
			int temp = sc.nextInt();
			if(temp == 0){
				break;
			}
			System.out.println("Case" + i++ + ": " + temp);
		}
	}
}