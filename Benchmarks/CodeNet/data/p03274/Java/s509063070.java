package com.sw;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	private static int N;
	private static int K;
	private static int[] candle;;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		candle = new int[N];
		st = new StringTokenizer(br.readLine());
		int index0 = 0;
		for (int i = 0; i < N; i++) {
			candle[i] = Integer.parseInt(st.nextToken());
			if(Math.abs(candle[i]) < Math.abs(candle[index0])){
				index0 = i;
			}
		}
		int minValue = Integer.MAX_VALUE;
		int begin = index0 - K + 1;
		int end = index0 + K - 1;
		if(candle[index0] < 0){
			end = index0 + K;
		}else{
			begin = index0 - K;
		}
		if(begin >= 0){
			minValue = Math.min(minValue, -candle[begin]);
			begin++;
		}else{
			begin = 0;
		}
		if(end < N){
			minValue = Math.min(minValue, candle[end]);
			end--;
		}else{
			end = N - 1;
		}
		for(int i = begin; i+K-1<=end; i++){
			minValue = Math.min(minValue, candle[i+K-1] - 2*candle[i]);
			minValue = Math.min(minValue, 2*candle[i+K-1] - candle[i]);
		}
		System.out.println(minValue);
	}
}
