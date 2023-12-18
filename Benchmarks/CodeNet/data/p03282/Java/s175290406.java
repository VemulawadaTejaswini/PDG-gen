import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		String K = sc.next();
		int k = 101;
		if(K.length() <= 3) k = Integer.valueOf(K);
		
		int index0 = -1;
		
		if(S.charAt(0) == '1'){
			for(int i = 0; i < S.length(); i++){
				if(S.charAt(i) == '1'){
					index0++;
				}else break;
			}
		}
		
		if(index0 == -1) System.out.println(S.charAt(0));
		else{
			if(k <= index0 + 1) System.out.println(1);
			else System.out.println(S.charAt(index0+1));
		}
	}
}