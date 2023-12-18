import java.util.HashSet;
import java.util.Set;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str_vs = br.readLine().split(" ");
        int vs[] = new int[n];
        int[] count1 = new int[100001];
        int[] count2 = new int[100001];
        int ans = 0;
        
        for (int i = 0; i < n; i++) {
            vs[i] = Integer.parseInt(str_vs[i]);
        }
        
        for (int i = 0; i < n; i+=2) {
            count1[vs[i]]++;
        }
        
        int max1 = 0;
        int second1 = 0;
        //int second_i1 = 0;
        int max_i1 = 0;
        for (int i = 0; i < 100001; i++) {
            if (max1<count1[i]) {
                //second1 = max1;
                //second_i1 = max_i1;
                max1 = count1[i];
                max_i1 = i;
            }
        }
        
        //ans += n/2-max1;
        //count = new int[100001];
        
        for (int i = 1; i < n; i+=2) {
            count2[vs[i]]++;
        }
        
        int max2 = 0;
        int second2 = 0;
        //int second_i2;
        int max_i2 = 0;
        for (int i = 0; i < 100001; i++) {
            if (max2<count2[i]) {
                //second2 = max2;
                //second_i2 = max_i2;
                max2 = count2[i];
                max_i2 = i;
            }
        }
        
        Arrays.sort(count1);
        Arrays.sort(count2);
        
        if (max_i1==max_i2) {
            //System.out.println("aaa");
            if (max1>max2) {
                //System.out.println(second2);
                ans = n/2-count1[100000] + n/2-count2[99999];
            }
            else {
                
                ans = n/2-count1[99999] + n/2-count2[100000];
            }
        }
        else {
            ans = n/2-count1[100000] + n/2-count2[100000];
        }
        
        //ans += n/2-max2;
        System.out.println(ans);
    }
}
