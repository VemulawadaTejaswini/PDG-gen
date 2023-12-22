import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int e_num,s_price,s_num,na_flag=0;

		while(true){
			n = sc.nextInt();
			if(n==0) break;
			
			for(int i=0; i<n; i++){
				e_num = sc.nextInt();
				s_price = sc.nextInt();
				s_num = sc.nextInt();
				
				if((s_price*s_num>=1000000)){
					System.out.println(e_num);
					na_flag=1;
				}
			}
			if(na_flag==0){
				System.out.println("NA");
			}
		}
	}
}