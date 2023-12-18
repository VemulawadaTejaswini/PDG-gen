import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long D = sc.nextLong();
		long E = sc.nextLong();
		sc.close();
		
		long time = 1;
		long city_1 = N;
		long city_2 = 0;
		long city_3 = 0;
		long city_4 = 0;
		long city_5 = 0;
		long city_6 = N;
		
		while (city_6>0){
			if (city_5>0){
				city_6 = city_6-Math.min(city_5, E);
				city_5 = city_5-Math.min(city_5, E);
			}
			if (city_4>0){
				city_5 = city_5+Math.min(city_4, D);
				city_4 = city_4-Math.min(city_4, D);
			}
			if (city_3>0){
				city_4 = city_4+Math.min(city_3, C);
				city_3 = city_3-Math.min(city_3, C);
			}
			if (city_2>0){
				city_3 = city_3+Math.min(city_2, B);
				city_2 = city_2-Math.min(city_2, B);
			}
			if (city_1>0){
				city_2 = city_2+Math.min(city_1, A);
				city_1 = city_1-Math.min(city_1, A);
			}
			
			time+=1;
		}
		System.out.print(time);
		
		
		
		

	}

}
