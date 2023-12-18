import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		long K = sc.nextLong();
		sc.close();

		int onecount = 0;
		for(int i = 0 ; i < S.length() ; i++){
			if(S.substring(i,i+1).equals("1"))
				onecount++;
			else{
				break;
			}
		}

		if(onecount >= K){
			System.out.println("1");
		}
		else{
			System.out.println(S.substring(onecount,onecount+1));
		}
	}
}
