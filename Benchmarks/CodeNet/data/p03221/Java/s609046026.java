import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Deque;


public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[][] pys = new int[m][2];
        
        for (int i = 0; i < m; i++) {
            String[] py = br.readLine().split(" ");
            pys[i][0] = Integer.parseInt(py[0]);
            pys[i][1] = Integer.parseInt(py[1]);
        }
        
        int[][] cities = new int[n][1000000];
        int[] cities_length = new int[n];
        int[] m2 = new int[n];
        
        for (int i = 0; i < m; i++) {
            int city_index = pys[i][0] - 1;
            cities[city_index][m2[city_index]] = pys[i][1];
            m2[city_index]++;
            cities_length[city_index]++;
        }
        
        for (int i = 0; i < n; i++) {
            Arrays.sort(cities[i]);
        }
        
        String pref = "";
        String suf = "";
        
        //System.out.println(nums.length);
        String[] nums = new String[m];
        int nums_index = 0;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < 6 - String.valueOf(i+1).length(); k++) {
                pref = "0" + pref;
            }
            for (int j = 0; j < cities_length[i]; j++) {
                for (int l = 0; l < 6 - String.valueOf(j+1).length(); l++) {
                    suf = "0" + suf;
                }
                String num = pref + String.valueOf(i+1) + suf + String.valueOf(j+1);
                nums[nums_index] = num;
                nums_index++;
                suf = "";
            }
            pref = "";
            //suf = "";
        }
        
        for (int i = 0; i < m; i++) {
            System.out.println(nums[i]);
        }
        
    }
}
