import java.util.Scanner;
public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tenbou = sc.nextInt();
		int way = sc.nextInt();
		int first;
		int second;
		int cnt = 0;

		int[] height = new int[tenbou];
		boolean[] check = new boolean[tenbou];

		for(int i = 0; i < tenbou; i++){
			height[i] = sc.nextInt();
			check[i] = true;
		}


		for(int i = 0; i < way; i++){
			first = sc.nextInt() - 1;
			second = sc.nextInt() - 1;

			if(height[first] > height[second]){
				check[first] = true;
				check[second] = false;
			}else if(height[first] < height[second]){
				check[second] = true;
				check[first] = false;
			}else{
				check[second] = false;
				check[first] = false;
			}
		}

		for(int i = 0; i < tenbou; i++){
			if(check[i]){
				cnt++;
			}
		}

		System.out.println(cnt);

		sc.close();
	}

}
