import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String abcd = scanner.next();
		int num[] = new int[4];
		num[0] = abcd.charAt(0)-'0';
		num[1] = abcd.charAt(1)-'0';
		num[2] = abcd.charAt(2)-'0';
		num[3] = abcd.charAt(3)-'0';
		int ans = -1 ,type = 0;
		while(true){
			type++;
			switch (type) {
				case 0:
					ans = num[0] + num[1] + num[2] + num[3];
					if(ans==7){
						System.out.println(num[0] +"+"+ num[1] +"+"+ num[2] +"+"+ num[3]+"=7");
						return;
					}
					break;
				case 1:
					ans = num[0] + num[1] + num[2] - num[3];
					if(ans==7){
						System.out.println(num[0] +"+"+ num[1] +"+"+ num[2] +"-"+ num[3]+"=7");
						return;
					}
					break;
				case 2:
					ans = num[0] + num[1] - num[2] + num[3];
					if(ans==7){
						System.out.println(num[0] +"+"+ num[1] +"-"+ num[2] +"+"+ num[3]+"=7");
						return;
					}
					break;
				case 3:
					ans = num[0] + num[1] - num[2] - num[3];
					if(ans==7){
						System.out.println(num[0] +"+"+ num[1] +"-"+ num[2] +"-"+ num[3]+"=7");
						return;
					}
					break;
				case 4:
					ans = num[0] - num[1] + num[2] + num[3];
					if(ans==7){
						System.out.println(num[0] +"-"+ num[1] +"+"+ num[2] +"+"+ num[3]+"=7");
						return;
					}
					break;
				case 5:
					ans = num[0] - num[1] + num[2] - num[3];
					if(ans==7){
						System.out.println(num[0] +"-"+ num[1] +"+"+ num[2] +"-"+ num[3]+"=7");
						return;
					}
					break;
				case 6:
					ans = num[0] - num[1] - num[2] + num[3];
					if(ans==7){
						System.out.println(num[0] +"-"+ num[1] +"-"+ num[2] +"+"+ num[3]+"=7");
						return;
					}
					break;
				case 7:
					ans = num[0] - num[1] - num[2] - num[3];
					if(ans==7){
						System.out.println(num[0] +"-"+ num[1] +"-"+ num[2] +"-"+ num[3]+"=7");
						return;
					}
					break;
			}
		}
	}
}