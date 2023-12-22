import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int tmp,num=1;
		while((tmp=sc.nextInt())!=0){
			System.out.printf("Case %d: %d\n",num++,tmp);
		}
		sc.close();
	}
}
