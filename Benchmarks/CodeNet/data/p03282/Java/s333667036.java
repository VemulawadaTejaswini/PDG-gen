import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		double b=sc.nextDouble();
		String end = "";
		double t = 5000 * 1000000 * 1000000;
		double cnt = 0;
		boolean flg = false;
		
//		System.out.println(t);
		
		String str[] = new String[100];
		
		for(int i=0;i<a.length();i++){
			str[i] = a.substring(i, i+1);
		}
		
		for(int i=0; i<100; i++){
			if (str[i] == null){
				break;
			}
			switch(str[i]){
			case "1":
				cnt++;
				if (cnt >b){
					System.out.println("1");
					flg = true;
				}
				break;
			case "2":
				for (double j=0;j<t;j++){
					cnt = cnt+2;
					if (cnt >b){
						System.out.println("2");
						flg = true;
						break;
					}
				}
				break;
			case "3":
				for (double j=0;j<t;j++){
					cnt = cnt+3;
					if (cnt >b){
						System.out.println("3");
						flg = true;
						break;
					}
				}
				break;
			case "4":
				for (double j=0;j<t;j++){
					cnt = cnt+4;
					if (cnt >b){
						System.out.println("4");
						flg = true;
						break;
					}
				}
				break;
			case "5":
				for (double j=0;j<t;j++){
					cnt = cnt+5;
					if (cnt >b){
						System.out.println("5");
						flg = true;
						break;
					}
				}
				break;
			case "6":
				for (double j=0;j<t;j++){
					cnt = cnt+6;
					if (cnt >b){
						System.out.println("6");
						flg = true;
						break;
					}
				}
				break;
			case "7":
				for (double j=0;j<t;j++){
					cnt = cnt+7;
					if (cnt >b){
						System.out.println("7");
						flg = true;
						break;
					}
				}
				break;
			case "8":
				for (double j=0;j<t;j++){
					cnt = cnt+8;
					if (cnt >b){
						System.out.println("8");
						flg = true;
						break;
					}
				}
				break;
			case "9":
				for (double j=0;j<t;j++){
					cnt = cnt+9;
					if (cnt >b){
						System.out.println("9");
						flg = true;
						break;
					}
				}
				break;
			default:
			}
			if (flg){
				break;
			}
		}
//		System.out.println("cnt="+cnt);
		
		
		
		
	}

}
