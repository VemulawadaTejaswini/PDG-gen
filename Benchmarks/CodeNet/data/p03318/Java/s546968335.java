import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputLine = sc.nextLine();
		long K = Long.parseLong(inputLine);
      
      	for(int i = 1;i < K && i < 10;++i)
          System.out.println(i);
      	if(K < 10)return;
		int pre = 1, saf = 1;
		int counter = 1;
		for(long i = 1;i <= K;++i) {
			System.out.print(counter++);
			for(int j = 0;j < saf;++j)
				System.out.print('9');
          	System.out.println();
			if(counter / (10*pre) >= 1) {
				counter = pre;	
    	        ++pre;
				++saf;
			}
		}
	}
}
