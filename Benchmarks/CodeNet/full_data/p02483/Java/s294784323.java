import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] one = new int[3];
		int[] two = new int[3];
		for(int i = 0; i < one.length; i++){
			int p = sc.nextInt();
			if(p >= one[0]){
				int x = one[0];
				int y = one[1];
				
				one[0] = p;
				one[1] = x;
				one[2] = y;
			}else{
				if(p >= one[1]){
					int x = one[1];
					one[1] = p;
					one[2] = x;
				}else{
					one[2] = p;
				}
			}
		}
		
		System.out.println(one[0] + " " + one[1] + " " + one[2]);
	}
}