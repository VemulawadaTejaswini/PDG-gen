import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		int goukei = 0;
		while(scan.hasNext()){
			String N = scan.next();
			char text[] = N.toCharArray();
			for(int i = 0; i < text.length; i++) {
				String seiv = "";
				if(text[i] == '1' || text[i] == '2' || text[i] == '3' || text[i] == '4' || text[i] == '5' || text[i] == '6' || text[i] == '7' || text[i] == '8' || text[i] == '9'){
					seiv += String.valueOf(text[i]);
					for(int j = i+1 ; j < text.length ; j++){
						if(text[j] == '0' || text[j] == '1' || text[j] == '2' || text[j] == '3' || text[j] == '4' || text[j] == '5' || text[j] == '6' || text[j] == '7' || text[j] == '8' || text[j] == '9'){
							seiv += String.valueOf(text[j]);
						}else{
							goukei += Integer.parseInt(seiv);
							i = j;
							break;
						}
					}
				}
			}
		}
		System.out.println(goukei);
	}
}