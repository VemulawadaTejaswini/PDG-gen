import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		  Scanner  scan = new   Scanner (System.in);
		int a=scan.nextInt();
		int a_max=scan.nextInt();
		int count=0;
		while(true){
			if(a_max<=0){
				break;
			}
			if(count==0){
			a_max-=a;
			}else{
				a_max-=a-1;
			}
			count++;
		}
		System.out.println(count);
	}
}