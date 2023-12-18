//package at_coder;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		ArrayList<String> board = new ArrayList<String>();
		while(true) {
			String line = sc.nextLine();
			if(line.equals("")) break;
			board.add(line);
		}
		sc.close();

		Calc calc = new Calc();
		System.out.println(calc.complexity(board));
	}
}

class Calc {
	int min(int[] nums) {
		int min = nums[0];
		for(int num:nums)
			if(min > num)
				min = num;
		return min;
	}

	int max(int x,int y) {
		if(x>y)
			return x;
		else
			return y;
	}

	ArrayList<String> cnvrtedBoard(ArrayList<String> board){
		ArrayList<String> res = new ArrayList<String>();
		int height = board.size();
		int width = board.get(0).length();

		for(int j=0;j<width;j++) {
			String line = "";
			for(int i=0;i<height;i++) {
				line += board.get(i).charAt(j);
			}
			res.add(line);
		}
		return res;
	}

	int complexity(ArrayList<String> board) {
		int height = board.size();
		int width = board.get(0).length();
		char mark = board.get(0).charAt(0);
		for(int i=0;i<height;i++) {
			for(int j=0;j<width;j++) {
				if(board.get(i).charAt(j)!=mark) {
					int[] scores = new int[height+width-2];

					for(int k=1;k<height;k++) {
						scores[k-1] = max(complexity((ArrayList<String>)board.subList(0,k)),
								complexity((ArrayList<String>)board.subList(k,height)));
					}

					ArrayList<String> cnvBoard = cnvrtedBoard(board);
					for(int k=1;k<width;k++) {
						scores[k+height-2] = max(complexity((ArrayList<String>)cnvBoard.subList(0,k)),
								complexity((ArrayList<String>)cnvBoard.subList(k,width)));
					}

					return min(scores)+1;
				}
			}
		}

		return 0;

	}
}
