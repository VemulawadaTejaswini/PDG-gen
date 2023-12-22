import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int val = scan.nextInt();
			if(val == 0){
				break;
			}
			for(int i = 0;i < 9;i++){
				val -= scan.nextInt();
			}
			System.out.println(val);
		}
	}
}