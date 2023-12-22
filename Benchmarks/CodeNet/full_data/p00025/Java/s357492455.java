import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		//String text = scan.next();
		while(scan.hasNext()){
			int a[] = new int[4];
			int b[] = new int[4];
			int hit = 0;
			int bur = 0;
			for(int i = 0 ; i < 4 ; i++){
				a[i] = scan.nextInt();
			}
			for(int i = 0 ; i < 4 ; i++){
				b[i] = scan.nextInt();
			}
			for(int i = 0 ; i < 4 ; i++){
				for(int j = 0 ; j < 4 ; j++){
					if(a[i] == b[j]){
						if(i == j){
							++hit;
						}else{
							++bur;
						}
					}
				}
			}
			System.out.println(hit + " " + bur);
		}
	}
}