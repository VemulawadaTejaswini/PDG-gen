import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		long s = scanner.nextInt();
		long c = scanner.nextInt();
		long count = 0;
		while(true){
			if(s>0 && c>=2){
				s = s-1;
				c = c-2;
				count++;
			}else if(s==0 && c>=2){
				c = c-2;
				s++;
			}else{
				break;
			}
		}
		System.out.println(count);
	}
}
