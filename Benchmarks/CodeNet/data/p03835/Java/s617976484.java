import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int max = sc.nextInt();
		int answer = sc.nextInt();
		int count=0;
		for(int a=0;a<=max;a++){
			for(int b=0;b<=max;b++){
				for(int c=0;c<=max;c++){
					if(a+b+c==answer) count++;
				}
			}
		}
		System.out.println(count);;
		
		sc.close();
	}
}
