/**
 * coding: utf-8
 * Copyright (C) 2020 Matsuda.Hironobu. All Rights Reserved.
 * Code for 'AtCoder Beginner Contest 101-B'
 * 2020/07/14
 */
import java.util.Scanner;

/**
 * @author Matsuda.Hironobu
 */
public class Main{
	/**
	 * @param args 起動時引数(なにも渡さない)
	 */
	public static void main(String[] args) {
		// 標準入力からのデータを関数に渡す
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		
		System.out.println(digitSums(n));
	}

	// 入力からのデータintを受け取り、結果をStringとして返す
	public static String digitSums(int n) {
		String si = Integer.toString(n);
		
		int s = 0;
		for(int i = 0; i < si.length(); i++) {
			s += Integer.parseInt(si.substring(i, i + 1));
		}
		
		if( n % s == 0) {
			return "Yes";
		} else {
			return "No";
		}
	}
}
