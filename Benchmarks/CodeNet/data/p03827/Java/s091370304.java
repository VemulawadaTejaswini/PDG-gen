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
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String S = sc.next();
		int x = 0;
		int ans = 0;
		for(int i = 0; i < N; i++){
			if(S.charAt(i) == 'I') x++;
			else x--;
			ans = Math.max(ans, x);
		}
		System.out.println(ans);
	}
}