import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sumA, sumB;
		int[] data = new int[31];
		
		for(int i = 0; i < 28; i++){
			data[sc.nextInt()] = 1;
		}
		for(int i = 1; i < 31; i++){
			if(data[i] == 0){
				System.out.println(i);
			}
		}
	}
}