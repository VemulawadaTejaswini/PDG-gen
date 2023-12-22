import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int C1=0,C2=0,C3=0,C4=0;
		for(int i=1;i<=n;i++){
			String result = sc.next();
			switch (result){
			case "AC":
				C1++;
				break;
			case "WA":
				C2++;
				break;
			case "TLE":
				C3++;
				break;
			case "RE":
				C4++;
				break;
			default:
			}
		}
		System.out.println("AC x "+ String.valueOf(C1));
		System.out.println("WA x "+ String.valueOf(C2));
		System.out.println("TLE x "+ String.valueOf(C3));
		System.out.println("Re x "+ String.valueOf(C4));
	}
}