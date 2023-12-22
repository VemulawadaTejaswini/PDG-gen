import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int p = scan.nextInt();
			int f = scan.nextInt();
			for(int i = 1;i < n;i++){
				int a = scan.nextInt();
				int b = scan.nextInt();
				if(f < b){
					p = a;
					f = b;
				}else if(f == b){
					p = (p < a)?p:a;
				}
			}
			System.out.println(p + " " + f);
		}
	}
}