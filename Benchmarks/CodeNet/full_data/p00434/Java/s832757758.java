import java.util.Scanner;
public class Main {
	
	static void Increment_Array(int[] array, int idx) {
		array[idx]++;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		int[] mem = new int[31];
		
		for(int r = 0; r < 28; r++) {
			int buf = stdIn.nextInt();
			Increment_Array(mem, buf);
		}
		
		for(int idx = 1; idx < 31; idx++) {
			if(mem[idx] == 0) System.out.println(idx);
		}
	}
}