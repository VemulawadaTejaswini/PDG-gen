import java.util.Scanner;

class Main{
    public static void main(String[] args){

	int n, q;
	int c = 0;

	Scanner sc = new Scanner(System.in);
      
        n = sc.nextInt();

	int[] s = new int[n];

        for(int i = 0; i < n; i++){
	    s[i] = sc.nextInt();
	}

	q = sc.nextInt();

	for(int i = 0; i < q; i++){
	    int t = sc.nextInt(); 	
	    int pos = -1;
	    int lower = 0; 
	    int upper = n - 1;
	    while (lower <= upper) {
		int mid = (lower + upper) / 2;
		if (s[mid] == t) {
		    pos = mid;
		    c++;
		    break;
		} else if (s[mid] < t) {
		    lower = mid + 1;
		} else {
		    upper = mid - 1;
		}
	    }
	}

	System.out.println(c);
    }
}

