
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int count = 0;
			for(int i=0; i < 10; i++){
				for(int j=0; j < 10; j++){
					for(int k=0; k < 10; k++){
						int l = n - i - j - k;
						if(0 <= l && l <= 9){
							count++;
						}
					}
				}
			}
			System.out.println(count);
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}