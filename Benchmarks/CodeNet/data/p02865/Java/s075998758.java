package training;
import java.util.Scanner;

class Training01 {
	public static void main(String[]orgs){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	if(n>2){
		int a = 1;
		int b = n-1;
		int count = 0;
		while(a<b){
			a++;
			b= n-a;
			count++;
		}
		System.out.println(count);
	}
	}
}
