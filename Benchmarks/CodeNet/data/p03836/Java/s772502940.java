import java.io.File;
import java.io.FileInputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Main {
	
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		Scanner sc = new Scanner(System.in);
		
		StringBuilder ans = new StringBuilder();
		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int tx = sc.nextInt();
		int ty = sc.nextInt();
		
		StringBuilder U = new StringBuilder();
		StringBuilder D = new StringBuilder();
		StringBuilder L = new StringBuilder();
		StringBuilder R = new StringBuilder();
		for(int i = 0; i < ty - sy; i++){
			U.append("U");
			D.append("D");
		}
		for(int i = 0; i < tx - sx; i++){
			L.append("L");
			R.append("R");
		}
		
		ans.append(U);
		ans.append(R);
		ans.append(D);
		ans.append(L);
		ans.append("L");
		ans.append(U);
		ans.append("U");
		ans.append("R");
		ans.append(R);
		ans.append("D");
		ans.append("R");
		ans.append("D");
		ans.append(D);
		ans.append(L);
		ans.append("L");
		ans.append("U");
		System.out.println(ans);
		
	}
}