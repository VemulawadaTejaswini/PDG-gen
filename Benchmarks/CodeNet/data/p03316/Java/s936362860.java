import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int divideNum = 0;
		for(int i = 0; i < str.length(); i++){
			divideNum = divideNum + str.charAt(i) - '0';
		}
		int num = Integer.parseInt(str);
		if(num%divideNum == 0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}