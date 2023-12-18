import java.util.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int aEnd = 0;
		int bStart = 0;
		int elseCount = 0;
		int total = 0;
		for (int i = 0; i < n; i++) {
		    char[] arr = br.readLine().toCharArray();
		    if (arr[0] == 'B') {
		        bStart++;
		    }
		    if (arr[arr.length - 1] == 'A') {
		        aEnd++;
		    }
		    if (arr[0] != 'B' && arr[arr.length - 1] == 'A') {
		        elseCount++;
		    }
		    total += getCount(arr);
		}
		total += Math.min(Math.min(aEnd, bStart), n - elseCount - 1);
		System.out.println(total);
    }
    
    static int getCount(char[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 'A' && arr[i + 1] == 'B') {
                count++;
            }
        }
        return count;
    }
}

