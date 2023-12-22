import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=1;
		while(true){
			if(i%3==0){
				System.out.printf(" %d", i);
			}else if(i%10==3){
				System.out.printf(" %d", i);
			}
			if(i==n){
				System.out.println();
				break;
			}
			i++;

		}
	