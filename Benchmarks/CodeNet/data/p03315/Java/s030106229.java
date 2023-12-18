import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner as = new Scanner(System.in);
		int n = as.nextInt();
        int m = as.nextInt();

        int[] foo;
        foo = new int[n];

        int min = 0;

		for(int i=0;i<n;i++) {
	        foo[i] = as.nextInt();
	        if(foo[i] == 1) {
	        	min = i;
	        }
		}

		if(n <= m) {
			System.out.println("1");
		}else{
			int count = min/(m-1);

			int tmp = (m-1)*count +1;

			count += (n - tmp)/(m-1);

			System.out.println(count);
		}




	}
}