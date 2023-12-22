import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			try{
				int N = in.nextInt();
				int M = in.nextInt();
				String L =Integer.toString(N + M);
				System.out.println(L.length());
			}catch(Exception e){
				System.exit(0);
			}
		}
	}
}