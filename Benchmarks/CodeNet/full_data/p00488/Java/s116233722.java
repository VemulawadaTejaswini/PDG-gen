import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		//String text = scan.next();
		int pasuta[] = new int[3];
		int jusu[] = new int[2];
		pasuta[0] = scan.nextInt();
		int minP = pasuta[0];
		for(int i = 1 ; i < 3 ; i++){
			pasuta[i] = scan.nextInt();
			if(minP > pasuta[i]){
				minP = pasuta[i];
			}
		}
		jusu[0] = scan.nextInt();
		jusu[1] = scan.nextInt();
		if(jusu[0] < jusu[1]){
			System.out.println((minP+jusu[0]-50));
		}else{
			System.out.println((minP+jusu[1]-50));
		}
	}
}