import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		for(int i = 1; i <= 10000; i ++){
			int num = scanner.nextInt();
			if(num == 0){
				break;
			}else{
				System.out.println("Case " + i + ": " + num);
			}
		}
		
	}
}