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
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] prime = new int[1001];
		for(int i = 2; i <= N; i++){
			int n = i;
			for(int p = 2; p * p <= n; p++){
				if(n % p == 0){
					int count = 0;
					while(n % p == 0){
						n /= p;
						count++;
					}
					prime[p] += count;
				}
			}
			if(n > 1) prime[n] += 1;
		}
		
		long ans = 1;
		for(int p : prime){
			ans = (ans * (p + 1)) % 1000000007;
		}
		System.out.println(ans);
	}
}