import java.util.Scanner;
public class Main {

	public static void main(String[] args)  {
			Scanner sc = new Scanner(System.in);
			int max = -1;
			int top = 0;
			int f = sc.nextInt();
			for(int i = 0 ; i < f ;i++){
				int n = sc.nextInt();
				int s = sc.nextInt();
				if(s > max ){
					max = s;
					top = n;
				}
			}
			System.out.println(top +" " + max);
			sc.close();
	}

}