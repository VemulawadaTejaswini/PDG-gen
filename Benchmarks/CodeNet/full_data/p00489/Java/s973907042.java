//package Soccor;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] score = new int[N];
		int[] order = new int[N];
		for(int i = 0; i < order.length; i++) order[i] = 1;
		for(int i = 0; i < N * (N - 1) / 2; i++) {
			int A = sc.nextInt() - 1;
			int B = sc.nextInt() - 1;
			int C = sc.nextInt();
			int D = sc.nextInt();
			if(C > D) score[A]+= 3;
			else if(C < D) score[B]+= 3;
			else {
				score[A]++;
				score[B]++;
			}
		}
		//for(int i = 0; i < order.length; i++) System.out.println(score[i]);
		for(int i = 0; i < score.length - 1; i++) {
			for(int j = i + 1; j < score.length; j++) {
				if(score[i] < score[j]) order[i]++;
				else if(score[i] > score[j]) order[j]++;
			}
		}
		for(int i = 0; i < order.length; i++) System.out.println(order[i]);
	}

}