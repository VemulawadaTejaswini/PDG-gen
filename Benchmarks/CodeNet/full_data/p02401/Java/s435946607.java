import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){	
			int a = sc.nextInt();
			String op =sc.next();
			int b = sc.nextInt();
			if(op=="?") break;
			if(op=="+"){
				int x = a+b;
				System.out.println(x);
			}else{
				if(op=="-"){
					int x = a-b;
					System.out.println(x);
				}else{
					if(op=="*"){
						int x = a*b;
						System.out.println(x);
					}else{
						if(op=="/"){
							int x = a/b;
							System.out.println(x);
						}
					}
				}
			}
		}
	}	
}