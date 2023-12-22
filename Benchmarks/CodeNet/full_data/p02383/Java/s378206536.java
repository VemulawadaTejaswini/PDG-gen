import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d1 = sc.nextInt();
		int d2 = sc.nextInt();
		int d3 = sc.nextInt();
		int d4 = sc.nextInt();
		int d5 = sc.nextInt();
		int d6 = sc.nextInt();
		String str = sc.next();
		String[] strArray = str.split("");
		int dir = strArray.length;
		int tmp = 0;

		for(int i=0; i<dir; i++){
			if(strArray[i].equals("E")){
				tmp = d1;
				d1 = d4;
				d4 = d6;
				d6 = d3;
				d3 = tmp;
			}else if(strArray[i].equals("N")){
				tmp = d1;
				d1 = d2;
				d2 = d6;
				d6 = d5;
				d5 = tmp;
			}else if(strArray[i].equals("S")){
				tmp = d1;
				d1 = d5;
				d5 = d6;
				d6 = d2;
				d2 = tmp;
			}else if(strArray[i].equals("W")){
				tmp = d1;
				d1 = d3;
				d3 = d6;
				d6 = d4;
				d4 = tmp;
			}
		}
		System.out.println(d1);
	}
}
