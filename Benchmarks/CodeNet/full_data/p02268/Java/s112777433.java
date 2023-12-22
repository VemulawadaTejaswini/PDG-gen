
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(bf.readLine());
        String[] sp1 = bf.readLine().split(" ");
        int n2 = Integer.parseInt(bf.readLine());
        String[] sp2 = bf.readLine().split(" ");
        int sum = 0;
        for (int j = 0; j < n2; j++) {
            if (binarySearch(sp1, sp2[j], 0, n1-1)) {
                sum++;
            }
        }
        System.out.println(sum);
    }

    private static boolean binarySearch(String sp2[], String key, int left, int right) {
        int mid = (left + right) / 2;
        if (left > right) {
            return false;
        }
        if (key.equals(sp2[mid])) {
            return true;
        } else if (Integer.parseInt(key) > Integer.parseInt(sp2[mid])) {
           return binarySearch(sp2, key, mid+1, right);
        } else {
            return binarySearch(sp2, key, left, mid-1);
        }

    }

}

