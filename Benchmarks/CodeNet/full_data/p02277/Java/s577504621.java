import java.io.BufferedReader;
//import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//System.setIn(new FileInputStream("./input.txt"));
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		String t;
		Card[] a = new Card[n + 1]; // + 1 is for a sentinel value 
		Card[] a2 = new Card[n + 1];
		for(int i = 0; i < n; ++i){
			t = br.readLine();
			//Card instances can be shared with a[] and a2[]
			a[i] = a2[i] = new Card(t.charAt(0), Integer.parseInt(t.substring(2)));
		}
		quickSort(a, 0, n - 1);
		mergeSort(a2, 0, n);
		
		StringBuilder sb = new StringBuilder();
		
		
		int i = 0;
		a[n] = new Card('T', -1);
		a2[n] = new Card('T', -2);
		while(a[i] == a2[i]){
			i += 1;
		}
		if(i == n){
			sb.append("Stable\n");
		}else{
			sb.append("Not stable\n");
		}
		
		for(i = 0; i < n; ++i) {
				sb.append(a[i] + "\n");
		}
		System.out.print(sb);
		
	}
	public static void quickSort(Card[] a, int p, int r){
		if(p < r){
			int q = partition(a, p, r);
			quickSort(a, p, q - 1);
			quickSort(a, q + 1, r);
		}
	}
	public static int partition(Card[] a, int p, int r){
		 int x = a[r].n;
		 int i = p - 1;
		 Card tmp;
		 for(int j = p; j < r; ++j) {
			 if(a[j].n <= x){
				 i += 1;
				 tmp = a[i];
				 a[i] = a[j];
				 a[j] = tmp;
			 }
		 }
		 tmp = a[i + 1];
		 a[i + 1] = a[r];
		 a[r] = tmp;
		 return i + 1;
	}

	public static void mergeSort(Card[] s, int left, int right) {
		if(left + 1 < right) {
			int mid = (left + right) / 2;
			mergeSort(s, left, mid);
			mergeSort(s, mid, right);
			merge(s, left, mid, right);
		}
	}
	public static void merge(Card[] s, int left, int mid, int right) {
		Card[] s1 = Arrays.copyOfRange(s, left, mid + 1);
		Card[] s2 = Arrays.copyOfRange(s, mid, right + 1);
		
		s1[mid - left] = new Card('T', Integer.MAX_VALUE);
		s2[right - mid] = new Card('T', Integer.MAX_VALUE);
		int i = 0;
		int j = 0;
		for(int k = left; k < right; ++k) {
			if(s1[i].n <= s2[j].n){
				s[k] = s1[i];
				i += 1;
			}else{
				s[k] = s2[j];
				j += 1;
			}
		}
		
	}
}

class Card{
	public char c;
	public int n;
	Card(char c, int n){
		this.c = c;
		this.n = n;
	}
	@Override
	public String toString() {
		return c + " " + n;
	}
}