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
	static int N;
	static char[] S;
	static boolean[] sw;
	
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		S = sc.next().toCharArray();
		sw = new boolean[N];
		
		sw[0] = true;
		if(S[0] == 'o'){
			sw[1] = true;
			if(sw[0] == First()){
				A();
				return;
			}
			
			sw[1] = false;
			if(sw[0] == First()){
				A();
				return;
			}
		}else{
			sw[1] = false;
			if(sw[0] == First()){
				A();
				return;
			}
			
			sw[1] = true;
			if(sw[0] == First()){
				A();
				return;
			}
		}
		
		sw[0] = false;
		if(S[0] == 'o'){
			sw[1] = false;
			if(sw[0] == First()){
				A();
				return;
			}
			
			sw[1] = true;
			if(sw[0] == First()){
				A();
				return;
			}
		}else{
			sw[1] = true;
			if(sw[0] == First()){
				A();
				return;
			}
			
			sw[1] = false;
			if(sw[0] == First()){
				A();
				return;
			}
		}
		
		System.out.println(-1);
	}
	
	public static boolean First(){
		boolean first;
		for(int i = 2; i < N; i++){
			if((sw[i-1] && S[i-1] == 'o' && sw[i-2])
			|| (sw[i-1] && S[i-1] == 'x' && !sw[i-2])
			|| (!sw[i-1] && S[i-1] == 'x' && sw[i-2])
			|| (!sw[i-1] && S[i-1] == 'o' && !sw[i-2])) sw[i] = true;
			else sw[i] = false;
		}
		if((sw[N-1] && S[N-1] == 'o' && sw[N-2])
		|| (sw[N-1] && S[N-1] == 'x' && !sw[N-2])
		|| (!sw[N-1] && S[N-1] == 'x' && sw[N-2])
		|| (!sw[N-1] && S[N-1] == 'o' && !sw[N-2])) first = true;
		else first = false;
		
		return first;
	}
	
	public static void A(){
		for(int i = 0; i < N; i++) System.out.print(sw[i] ? "S" : "W");
	}
}