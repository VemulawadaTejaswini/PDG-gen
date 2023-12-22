import java.util.*;

 class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] inputArray = input.split(" ");

		if(inputArray.length == 2){
			int a = Integer.parseInt(inputArray[0]);
			int b = Integer.parseInt(inputArray[1]);
			if(a < b){
				System.out.println("a < b");
			}
			else if(b < a){
				System.out.println("a > b");
			}
			else if(a == b){
				System.out.println("a == b");
			}
		}
		else{
			System.out.println("2????????´??°?????\?????????????????????");
		}
	}
}