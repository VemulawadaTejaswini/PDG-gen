import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 30; i++){
			int n = sc.nextInt();
			int x = 0;
			boolean is = true;
			for(int u = 2; u <= n; u++){
				is = true;
				for(int t = 2; t < u; t++){
					if(u % t == 0)
					is = false;
				}
				if(is)x++;
			}
			System.out.println(x);
		}
	}
}