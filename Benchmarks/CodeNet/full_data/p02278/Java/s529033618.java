import java.io.BufferedReader;
//import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
	public static void main(String[] args) throws IOException {
		//System.setIn(new FileInputStream("./ALDS1_6_D-in15.txt"));
		
		// Input an array
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
	
		Baggage[] a = new Baggage[n];
		String[] strs = br.readLine().split(" ");
	    for(int i = 0; i < n; ++i){
	        a[i] = new Baggage(i, Integer.parseInt(strs[i]));
	    }
	    
	    // Number the array
	    mergeSort(a, 0, n);
	    /*
	    for(int i = 0; i < n; ++i) {
	    	System.out.printf(" %3d", i);
	    }
	    System.out.println();
	    for(int i = 0; i < n; ++i) {
	    	System.out.printf(" %3d", a[i].weight);
	    }
	    System.out.println();
	    for(int i = 0; i < n; ++i) {
	    	System.out.printf(" %3d", a[i].org);
	    }
	    System.out.println();*/
	    
	    // Calc. cost
	    int cost = 0;
	    int minw = a[0].weight;
	    for(int i = 0; i < n; ++i) {
	    	if(a[i].flag == true){
		    	// search group key i
	    		continue;
	    	}
	    	//System.out.print("key " + i + " " + a[i].weight + ": ");
    		
	    	// count cost for group i
	    	int cnt = 0; // swap count
	    	int j = a[i].org;
	    	while(j != i) {
	    		// swap a[j] and a[i]
	    	    cost += a[j].weight + a[i].weight;
	    		cnt += 1;

	    		//System.out.print(" " + a[j].weight);
	    	    a[j].flag = true;
		    	j = a[j].org;
	   	    }
	    	int loss = (a[i].weight * cnt) - minw * cnt - 2 * (minw + a[i].weight);
	    	if(loss > 0){
	    		cost -= loss;
	    	}
	    	//System.out.println(" ; cost " + cost);
	    }
	    
	    System.out.println(cost);
	}
	
	public static void mergeSort(Baggage[] s, int left, int right) {
		if(left + 1 < right) {
			int mid = (left + right) / 2;
			mergeSort(s, left, mid);
			mergeSort(s, mid, right);
			merge(s, left, mid, right);
		}
	}
	public static void merge(Baggage[] s, int left, int mid, int right) {
		Baggage[] s1 = Arrays.copyOfRange(s, left, mid + 1);
		Baggage[] s2 = Arrays.copyOfRange(s, mid, right + 1);
		
		s1[mid - left] = new Baggage(-1, Integer.MAX_VALUE);
		s2[right - mid] = new Baggage(-1, Integer.MAX_VALUE);
		int i = 0;
		int j = 0;
		for(int k = left; k < right; ++k) {
			if(s1[i].weight <= s2[j].weight){
				s[k] = s1[i];
				i += 1;
			}else{
				s[k] = s2[j];
				j += 1;
			}
		}
		
	}
}

class Baggage {
	public int org;
	public int weight;
	public boolean flag;
	public Baggage(int o, int w) {
		org = o;
		weight = w;
		flag = false;
	}
}