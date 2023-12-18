import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int inA = Integer.parseInt(scanner.next());
		int inB = Integer.parseInt(scanner.next());
		int inC = Integer.parseInt(scanner.next());
		int inD = Integer.parseInt(scanner.next());
		int ontime = 0;
		boolean alice = false;
		boolean bob = false;

		for(int t = 0; t <= 100; t++){
			if(inA <= t && t <= inB){
				alice = true;
			}else{
				alice = false;
			}
			if(inC <= t && t <= inD){
				bob = true;
			}else{
				bob = false;
			}
			if(alice&&bob) ontime++;
		}

		System.out.println(ontime - 1);
	}
}