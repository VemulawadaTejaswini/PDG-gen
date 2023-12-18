import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		long A = sc.nextLong();
		long B = sc.nextLong();
		int K = sc.nextInt();
		
		for(int i = 0; i < K; i++){
			if(i % 2 == 0){
				if(A % 2 == 1) A--;
				B += A / 2;
				A /= 2;
			}else{
				if(B % 2 == 1) B--;
				A += B / 2;
				B /= 2;
			}
		}
		
		System.out.println(A + " " + B);
	}
}