import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int[] score;
		score = new int[1000];
		int sum = 0;
		double v = 0,ave = 0,a;
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i=0;i<n;i++){
			score[i] = input.nextInt();
			sum += score[i];
		}
		ave = sum*1.0/n;
		for(int i=0;i<n;i++){
			v += (score[i]-ave)*(score[i]-ave);
		}
		a = Math.sqrt(v/n);
		System.out.println(a);
	}
}