import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputLine = sc.nextLine();
		long K = Long.parseLong(inputLine);
		sc.close();	
      
		for(int i = 1;i < 10;++i)
			System.out.println(i);
		if(K >= 10)
			for(long i = 0;i <= K-10;++i)
				System.out.println(10*(i+1)+9);
	}
}
