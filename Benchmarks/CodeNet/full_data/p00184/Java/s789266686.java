import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] age = new int[7];
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			for(int i = 0 ; i < n ; i++){
			int a = sc.nextInt();
			if(a < 10){
				age[0]++;
			} else if(a >= 10 && a < 20){
				age[1]++;
			}else if(a >= 20 && a < 30){
				age[2]++;
			}else if(a >= 30 && a < 40){
				age[3]++;
			}else if(a >= 40 && a < 50){
				age[4]++;
			}else if(a >= 50 && a < 60){
				age[5]++;
			}else if(a >= 60){
				age[6]++;
			}
			}
			for(int i : age){
				System.out.println(i);
			}
		}
		for(int i : age){
			System.out.println(i);
		}
		sc.close();
	}

}