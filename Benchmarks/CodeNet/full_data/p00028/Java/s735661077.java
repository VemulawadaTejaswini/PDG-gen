import java.io.*;
import java.util.*;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;


class Main {
	public static void main(String[] a) throws IOException {
		Scanner scan = new Scanner(System.in);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String brf;
		int[] maxs = new int [100];
		int num[] = new int [101];
		int check [] = new int [100];
		int max = 0;
		while ((brf=br.readLine()) != null){
	
		while((brf = br.readLine())!=null){
			num[Integer.parseInt(brf)]++;
		}
		for(int i = 1;i < 101;i++){
			if(num[i] > max){
				max = num[i];
			}
		}
		for(int i = 1; i < 101; i++){
			if(num[i] == max){
				System.out.println(num[i]);
			}
		}
	}	
	}
}