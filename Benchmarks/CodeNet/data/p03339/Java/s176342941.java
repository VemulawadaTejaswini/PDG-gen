import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int count;
		int min = 100000000;
		for(int i=0; i<N; i++){
			count = 0;
			for(int j=0; j<N; j++){
				if(j<i){
					if(S.charAt(j)=='W'){
						count ++;
					}
				}else if(i<j){
					if(S.charAt(j)=='E'){
						count ++;
					}
				}
			}
			min = Math.min(min,count);
		}
		System.out.println(min);
	}
}
