import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){

	//	for(int i = 0;i< args.length/2;i++){
		while(scan.hasNextLine()){	
			int a = scan.nextInt();
			int b = scan.nextInt();
//			int a = Integer.parseInt(args[i]);
//			int b = Integer.parseInt(args[i+1]);
			if(a == 0 && b == 0){
				break;
			}
			if(a<b){
				System.out.println(a + " " + b);
			}else if(b<a){
				System.out.println(b + " " + a);
			}else{
				System.out.println(a + " " + b);
			}
		}
	}
}

