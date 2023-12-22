import java.util.Scanner;


class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int num;
		int cnt = 0;
		while( (num = sc.nextInt()) != 0 ){
			cnt++;
			System.out.printf("Case %d: %d\n",cnt,num);
		}

    }
}