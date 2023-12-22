
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n != 0){
			int [] sum = new int[301];
			Arrays.fill(sum, 1);
			for(int i = 2; i * i <= 289 ; i++){
				
				for(int j=0; j <= 300;j++){
					if(j - i*i >= 0){
						sum[j] += sum[j - i*i];
					}
				}
			}
			
			System.out.println(sum[n]);
			n = sc.nextInt();
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}