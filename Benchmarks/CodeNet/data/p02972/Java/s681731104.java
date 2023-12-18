import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.awt.Point;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n+1];
        //int[] b = new int[n];
        String[] s = br.readLine().split(" ");
        List<Integer> nums = new ArrayList();
        
        for (int i = 0; i < n; i++) {
            a[i+1] = Integer.parseInt(s[i]);
        }
        
        for (int i = n/2+1; i <= n; i++) {
            if (a[i] == 1) {
                nums.add(i);
            }
        }
        
        //Arrays.sort(b);
        int x = 0;
        for (int i = n/2; i >= 1; i--) {
            x = 0;
            for (int num:nums) {
                if (num%i == 0) x++;
            }
            if (x%2==1) {
                if (a[i] == 1) continue;
                else {
                    System.out.println(-1);
                    return;
                }
            }
            else {
                //System.out.println("bbbbb");
                if (a[i] == 1) {
                    nums.add(i);
                    continue;
                }
                else {
                    continue;
                }
                
            }
        }
        
        System.out.println(nums.size());
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i));
            if (i == nums.size()-1) System.out.printf("\n");
        }
        
    }

    
}



