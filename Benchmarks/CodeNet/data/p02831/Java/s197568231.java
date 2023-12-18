import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();

		for(int i = 1;i<b+1;i++){
			long tmp = a*i;
			if(tmp > b){
				if(tmp%b==0){
					System.out.println(tmp);
					break;
				}
			}else{
				if(b%tmp==0){
					System.out.println(tmp);
					break;
				}
			}
		}
	}
}