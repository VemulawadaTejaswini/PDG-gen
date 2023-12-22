import java.util.Scanner;

public class Main {

	static char[][] soroban;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		boolean first = true;
		while(cin.hasNext()){
			if(first){
				first=false;
			}
			else{
				System.out.println();
			}
			soroban = new char[9][6];
			make();
			String str =cin.next();
			for(int i = str.length();i<=5;i++){
				str = "0"+str;
			}
			for(int i = 1;i<=str.length();i++){
				int keta = str.length()-i;
				int value = str.charAt(keta)-'0';
				if(value/5+1 == 2){
					soroban[1][6-i]=' ';	
				}
				else{
					soroban[2][6-i]=' ';	
				}
				soroban[value%5 + 4][6-i]=' ';
			}
			output();
		}
	}
	static void output(){
		for(int i = 1;i< 9; i++){
			for(int j = 1;j < 6;j++){
				System.out.print(soroban[i][j]);
			}
			System.out.println();
		}
		
	}
	static void make(){
		for(int i = 1;i< 9; i++){
			for(int j = 1;j < 6;j++){
				soroban[i][j]='*';
			}
		}
		for(int i = 1;i<6;i++){
			soroban[3][i]='=';
		}
	}
}