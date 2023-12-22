import java.util.Scanner;

public class Main{
	private static Scanner sc=new Scanner(System.in);
	private static int r=sc.nextInt();
	private static int c=sc.nextInt();
	private static int[][] data=new int[r+1][c+1];
	public static void main(String args[]){
		input();
		setSum();
		output();
	}
	private static void input(){
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				data[i][j]=sc.nextInt();
			}
		}
	}
	private static void setSum(){
		for(int i=0;i<r;i++){
			int sum=0;
			for(int j=0;j<c;j++){
				sum+=data[i][j];
			}
			data[i][c]=sum;
		}
		for(int j=0;j<c+1;j++){
			int sum=0;
			for(int i=0;i<r;i++){
				sum+=data[i][j];
			}
			data[r][j]=sum;
		}
	}
	private static void output(){
		for(int i=0;i<=r;i++){
			for(int j=0;j<c;j++){
				System.out.print(data[i][j]+" ");
			}
			System.out.println(data[i][c]);
		}
	}
}