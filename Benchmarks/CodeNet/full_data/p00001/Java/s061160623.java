import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] h = new int[4];
		for(int i=0; i<h.length; i++){
			h[i] = sc.nextInt();
		}
		
		for(int i=0; i<3; i++){
			for(int j=i; j<h.length; j++){
				if(h[j] > h[i]){
					int max = h[j];
					h[j] = h[i];
					h[i] = max;
				}
			}
			System.out.println(h[i]);
		}
	}

}