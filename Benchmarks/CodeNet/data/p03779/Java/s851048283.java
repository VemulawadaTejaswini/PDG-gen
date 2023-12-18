import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ここにコードを挿入
		Scanner s = new Scanner(System.in);
		long l = s.nextLong();
		for(long i = 1;i < l;i++){
			if(0.5*i+(i+1)>=l){
				System.out.println(i);
				break;
			}
		}
		
	}

}