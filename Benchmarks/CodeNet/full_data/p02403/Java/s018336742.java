import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		for(;;){
			a=sc.nextInt();
			b=sc.nextInt();
			if(a==0&&b==0)break;
			else{for(int i=0;i<a;i++){
				for(int l = 0;l<b;l++){
					System.out.print("#");}
				System.out.println();
				}System.out.println();
			}
		}

	}}