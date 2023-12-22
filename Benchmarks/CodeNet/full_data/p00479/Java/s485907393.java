import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		//String text = scan.next();
		int n = scan.nextInt();
		int k = scan.nextInt();
		int ai[] = new int[k];
		int bi[] = new int[k];
		for(int i = 0 ; i < k ; i++){
			ai[i] = scan.nextInt();
			bi[i] = scan.nextInt();
		}
		if(n % 2 == 1){
			for(int i = 0 ; i < k ; i++){
				int Ai = 0;
				int Bi = 0;
				if(ai[i] <= n/2+1 && bi[i] <= n/2+1){
					Ai = ai[i];
					Bi = bi[i];
				}else if(ai[i] > n/2+1 && bi[i] <= n/2+1){
					Ai = n-ai[i]+1;
					Bi = bi[i];
				}else if(ai[i] <= n/2+1 && bi[i] > n/2+1){
					Ai = ai[i];
					Bi = n-bi[i]+1;
				}else{
					Ai = n-ai[i]+1;
					Bi = n-bi[i]+1;
				}
				if(Ai <= Bi){
					if(Ai % 3 == 0){
						System.out.println(3);
					}else if(Ai % 3 == 1){
						System.out.println(1);
					}else{
						System.out.println(2);
					}
				}else{
					if(Bi % 3 == 0){
						System.out.println(3);
					}else if(Bi % 3 == 1){
						System.out.println(1);
					}else{
						System.out.println(2);
					}
				}
			}
		}else{
			for(int i = 0 ; i < k ; i++){
				int Ai = 0;
				int Bi = 0;
				if(ai[i] < n/2+1 && bi[i] < n/2+1){
					Ai = ai[i];
					Bi = bi[i];
				}else if(ai[i] > n/2 && bi[i] < n/2+1){
					Ai = n-ai[i]+1;
					Bi = bi[i];
				}else if(ai[i] < n/2+1 && bi[i] > n/2){
					Ai = ai[i];
					Bi = n-bi[i]+1;
				}else{
					Ai = n-ai[i]+1;
					Bi = n-bi[i]+1;
				}
				if(Ai <= Bi){
					if(Ai % 3 == 0){
						System.out.println(3);
					}else if(Ai % 3 == 1){
						System.out.println(1);
					}else{
						System.out.println(2);
					}
				}else{
					if(Bi % 3 == 0){
						System.out.println(3);
					}else if(Bi % 3 == 1){
						System.out.println(1);
					}else{
						System.out.println(2);
					}
				}
			}
		}
		
	}
}