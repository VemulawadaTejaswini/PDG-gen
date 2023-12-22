import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main (String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String[] str1 = in.readLine().split(" ");
        int q = Integer.parseInt(in.readLine());
        String[] str2 = in.readLine().split(" ");
        int[] check = new int[q];
        int cnt = 0;
        
        for (int i=0; i<n; i++) {
            for (int j=0; j<q; j++) {
                if (check[j] == 0) {
                    if (str1[i].equals(str2[j])) {
                        cnt++;
                        check[j] = -1;
                    }
                }
            }
        }
        
        System.out.println(cnt);
    }
}