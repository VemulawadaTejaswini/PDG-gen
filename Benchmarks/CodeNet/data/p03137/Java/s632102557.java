import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main implements Runnable {
    
    private int n;
    private int m;
    private int[] x;

    public static void main(String[] args) throws IOException {
        Main m = new Main();
	    m.run();
    }

    private void set() {
	    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
	        String[] parts = br.readLine().split("[\\s]+");
	        n = Integer.parseInt(parts[0]);
	        m = Integer.parseInt(parts[1]);
	        x = Arrays.stream(br.readLine().split("[\\s]+"))
		    .mapToInt(Integer::parseInt).sorted().toArray();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
    }

    @Override
    public void run() {
	    set();
	    if (n >= m) {
	        System.out.println(0);
	        System.exit(0);
	    }
	    if (n == 1) {
	        System.out.println(x[m-1]-x[0]);
	        System.exit(0);
	    }
	    int[][] y = new int[m-1][2];
	    boolean[] located = new boolean[m];
	    for (int i=0;i<m-1;i++) {
	        y[i][0] = x[i+1] - x[i];
	        y[i][1] = i;
	    }
	    Arrays.sort(y,(a,b) -> Integer.compare(b[0],a[0]));
	    for (int i=0;i<n-1;i++) {
	        located[y[i][1]+1] = true;
	    }
	    if (!located[0]) {
	        located[0] = true;
	    } else {
	        located[y[n-1][1]+1] = true;
	    }
	    int sum = 0;
	    int idx = 0;
	    while (idx < m-1) {
	        if (located[idx]) {
		        int lower = x[idx];
		        while (idx < m-1 && !located[idx+1]) idx++;
		        sum += x[idx] - lower;
	        }
	        idx++;
	    }
	    System.out.println(sum);
    }
}