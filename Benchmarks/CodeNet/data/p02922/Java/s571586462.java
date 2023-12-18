import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ct = 1;
		if(b == 1){
			ct = 0;
		}else if(a > b){

		}else{
			while(a < b){
				a = a + a - 1;
				ct ++;
			}
		}
		System.out.println(ct);
	}


}