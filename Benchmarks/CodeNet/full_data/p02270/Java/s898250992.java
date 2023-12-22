import java.util.Arrays;

public class Main {
    // field
    static int arraySize, truck;
    static  int[] input;

    // method
    public static void main(String[] args) {
	//System.out.print("> ");
	java.util.Scanner scan = new java.util.Scanner(System.in);
	arraySize = scan.nextInt();          // n
	truck = scan.nextInt();              // k
	input = new int[arraySize];
	//System.out.print("> ");
	for (int i = 0; i < arraySize; i++){
	    input[i] = scan.nextInt();
	}
	int ans = solve();
	System.out.println(ans);
    }

    private static int solve(){
	int left = 0;
	int right = 100000*10000;
	while(right-left>1){
	    int mid = (left+right)/2;
	    int v = search_maxv(mid);
	    if (v >= arraySize) {
		right = mid;
	    } else {
		left = mid;
	    }
	}
	return right;
    }

    private static int search_maxv(int P){
	int v = 0;
	for (int i = 0; i<truck; i++) {
	    int w = 0;
	    while(w+input[v]<=P){
		w+=input[v];
		v++;
		if(v == arraySize) return v;
	    }
	}
	return v;
    }
}

