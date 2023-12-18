import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int list[] = {a, b};
		int sum = 0;

		for(int i=0; i<2; i++){
			if(list[0] > list[1]){
				sum += list[0];
				list[0]--;
			}else{
				sum += list[1];
				list[1]--;
			}
		}

		System.out.println(sum);
    }
}