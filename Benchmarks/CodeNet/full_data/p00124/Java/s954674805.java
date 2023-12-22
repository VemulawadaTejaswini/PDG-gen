import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while(scan.hasNext()){
			String[] team = new String[n];
			int[] score = new int[n];
			for(int i = 0;i < n;i++){
				team[i] = scan.next();
				score[i] = 3*scan.nextInt() + 0*scan.nextInt() + scan.nextInt();
			}
			for(int i = 0;i < n;i++){
				for(int j = n-1;j > i;j--){
					if(score[j] > score[j-1]){
						swap(team,score,j,j-1);
					}
				}
			}
			PrintOut(team,score,n);
			n = scan.nextInt();
			if(n == 0){
				break;
			}else{
				System.out.println();
			}
		}
	}
	
	public static void swap(String[] str,int[] num,int i,int j){
		String temp = str[i];
		str[i] = str[j];
		str[j] = temp;
		int tempp = num[i];
		num[i] = num[j];
		num[j] = tempp;
	}
	
	public static void PrintOut(String[] str,int[] num,int n){
		for(int i = 0;i < n;i++){
			System.out.println(str[i]+","+num[i]);
		}
	}
}