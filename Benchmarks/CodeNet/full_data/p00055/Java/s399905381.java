import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			float a = sc.nextFloat();
			float sum = 0;
			
			if( (a < 1.0) || (a > 10.0)) break;
			
			for(int i = 0; i < 10; i++){
				if(i % 2 == 0){
					a *= 2;
				}else{
					a /= 3;
				}
				sum += a;
			}
			System.out.println(sum);
		}
	}

}