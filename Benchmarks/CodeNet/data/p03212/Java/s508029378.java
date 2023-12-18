import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s;
		int count =0;
		for(int i=1;i<=N;i++) {
			s = Integer.toString(i);
			if((s.indexOf("3")!=-1)&&(s.indexOf("5")!=-1)&&(s.indexOf("7")!=-1)) {
				if((s.indexOf("0")==-1)&&(s.indexOf("1")==-1)&&(s.indexOf("2")==-1)&&(s.indexOf("4")==-1)&&(s.indexOf("6")==-1)&&(s.indexOf("8")==-1)&&(s.indexOf("9")==-1)) {
					count++;
				}
			}
		}	
		System.out.println(count);
		sc.close();
	}
}
