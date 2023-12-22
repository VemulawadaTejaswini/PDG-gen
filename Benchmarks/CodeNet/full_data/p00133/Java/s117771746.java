import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch[][]=new char[8][8];
		for(int i=0;i<8;i++){
			ch[i]=sc.next().toCharArray();
		}
		turn(ch,1);
	}
	static void turn(char ch[][],int k){
		if(3<k) return;
		char turn[][]=new char[8][8];
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				turn[i][j]=ch[7-j][i];
			}
		}
		System.out.println(k*90);
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				System.out.print(turn[i][j]);
			}
			System.out.println();
		}
		turn(turn,k+1);
	}
}