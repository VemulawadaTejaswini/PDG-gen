package volume0;

import java.util.Scanner;


public class ListofTop3Hills {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] in = new int[10];
		for(int i=0;i<10;i++){
			in[i] = sc.nextInt();
		}
		int big[] = {in[0],in[1],in[2]};
		
		for(int i =0;i<10;i++){
			if(big[0] < in[i]){
				big[2] = big[1];
				big[1] = big[0];
				big[0] = big[i];
			}
			else if(big[1] < in[i]){
				big[2] = big[1];
				big[1] = big[i];
			}
			else if(big[2] < in[i]){
				big[2] = big[i];
			}
		}
		
		for(int i=0;i<3;i++){
			System.out.println(big[i]);
		}
	}

}