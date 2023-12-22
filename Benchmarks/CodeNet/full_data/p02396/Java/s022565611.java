import java.util.Scanner;

class Main {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int count=0;
		int num;
		while(scan.hasNext()) {
			num=scan.nextInt();
			if(num==0) {
				break;
			}
			count+=1;
			System.out.printf("Case %d: %d\r\n",count, num);
		}
		scan.close();

	}

}
