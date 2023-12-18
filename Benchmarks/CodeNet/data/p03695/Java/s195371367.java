import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] a = new int[N];
        int[] lower = {1, 400, 800, 1200, 1600, 2000, 2400, 2800};
        int[] upper = {399, 799, 1199, 1599, 1999, 2399, 2799, 3199};
        String[] s = {"G", "B", "G", "W", "B", "Y", "O", "R"};
        HashSet<String> set = new HashSet<String>();
        int x = 0;
 
        for(int i=0; i<N; i++){
            a[i] = sc.nextInt();
            for(int j=0; j<8; j++){
                if(a[i]>=lower[j] && a[i]<=upper[j]){
                    set.add(s[j]);
                }
            }
            if(a[i]>=3200){
                x++;
            }
        }
        int min;
        if(set.size()>=1){
            min = set.size();
        }
        else{
            min = 1;
        }
        int max;
        
        max = set.size() + x;
        
        System.out.println(min + " " + max);
    }
}