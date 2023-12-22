import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String x[] = new String[n];
		for(int i = 0;i < n;i++){
			x[i] = sc.next();
		}
		String min = "zzzzzzzzzzzzzzzzzzzz";
		int flag=0;
		for(int i = 0;i <= 20;i++){
			for(int j = 0;j < n;j++){
				flag = 0;
				if(x[j].charAt(i)<min.charAt(i)){min = x[j];flag=0;}
				else if(x[j].charAt(i)==min.charAt(i)) flag = 1;
			}
			if(flag==0)break;
		}
		System.out.println(min);
	}
}