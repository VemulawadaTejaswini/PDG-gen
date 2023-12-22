import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		while(scan.hasNext()){
			char N[][] = new char[8][8];
			String n[] = new String[8];
			String Decision = null;
			int ContinueOrEnd = 0;
			for(int i = 0 ; i < 8 ; i++){
				n[i] = scan.next();
				char Substitution[] = n[i].toCharArray();
				for(int j = 0; j < 8 ;j++){
					N[i][j] = Substitution[j];
				}
			}
			for(int i = 0 ; i < 8 ; i++){
				for(int j = 0 ; j < 8 ; j++){
					if(N[i][j] == '1'){
						++j;
						if(N[i][j] == '1'){
							++j;
							if(N[i][j] == '1'){
								ContinueOrEnd = 1;
								Decision = "C";
								break;
							}else{
								j-=3;
								++i;
								if(N[i][j] == '1'){
									ContinueOrEnd = 1;
									Decision = "G";
									break;
								}else{
									++j;
									if(N[i][j] == '1'){
										ContinueOrEnd = 1;
										Decision = "A";
										break;
									}else{
										ContinueOrEnd = 1;
										Decision = "E";
										break;
									}
								}
							}
						}else{
							j-=2;
							++i;
							if(N[i][j] == '1'){
								ContinueOrEnd = 1;
								Decision = "D";
								break;
							}else{
								j+=2;
								if(N[i][j] == '1'){
									ContinueOrEnd = 1;
									Decision = "F";
									break;
								}else{
									ContinueOrEnd = 1;
									Decision = "B";
									break;
								}
							}
						}
					}
				}
				if(ContinueOrEnd == 1){
					break;
				}
			}
			System.out.println(Decision);
		}
	}
}