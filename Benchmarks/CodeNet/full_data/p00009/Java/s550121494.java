import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner s = new Scanner(System.in);

		while(s.hasNext()){
			
			int n = s.nextInt();
			int count = 0;
			
			
			for(int i = n; i > 1;i--){
				boolean check = true;
				for(int j = i-1;j>1;j--){
					if(i % j == 0){
						check = false;
						break;
					}
				}
				if(check){
					count++;
				}
			}
			
			System.out.println(count);

		}
	}
}