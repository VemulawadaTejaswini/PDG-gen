import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    
    public static void main(String[] args) throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int n = Integer.parseInt(br.readLine());
	int f = 0;
	if (n == 0 || n == 1) {
	    f = 1;
	} else {
	    int f1 = 1;
	    int f2 = 1;
	    for (int i = 2; i < n + 1; i++) {
		f = f1 + f2;
		f1 = f2;
		f2 = f;
	    }
	}
	System.out.println(f);
    }
}


