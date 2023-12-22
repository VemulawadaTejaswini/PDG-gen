import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int result[] = new int[30];
		int count = 0, a,x = 0;
		while(sc.hasNext()){
			a = sc.nextInt();
			for(int i = 2; a != 1; i++){
				if(a%i == 0){
					while(a%i == 0 && a != 1){
						a /= i;
					}
					count++;
				}
				result[x] = count;
				x++;
				count = 0;
			}
		}
		for(int i = 0; i < x; i++){
			System.out.println(result[i]);
		}
	}
}