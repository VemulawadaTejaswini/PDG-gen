import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(b == 0 && a == 0) break;
			int count = 0;
			for(int i = a ; i <= b ; i++){
				if(i%400 == 0){
					System.out.println(i);
					count++;
				}else if(i%100 == 0){
					;
				}else if(i%4 == 0){
					System.out.println(i);
					count++;					
				}
			}
			if(count == 0){
				System.out.println("NA");
			}
		}
		sc.close();
	}

}