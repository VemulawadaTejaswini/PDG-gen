import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Main {
	public static void main (String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String str1[] = in.readLine().split(" ");
        int q = Integer.parseInt(in.readLine());
        String str2[] = in.readLine().split(" ");
        List <Integer>listStr1 = new ArrayList<Integer>();
        
        int cnt = 0;
        
        for(int i=0; i<n; i++) {
            listStr1.add(Integer.parseInt(str1[i]));
        }
        
        Collections.sort(listStr1);
        
        for (int i=0; i<q; i++) {
            if (binarySearch(listStr1, Integer.parseInt(str2[i]), 0, n-1))
                cnt++;
        }
        
        System.out.println(cnt);
    }
    
    public static boolean binarySearch (List <Integer>list,
                                        int num, int l, int r) {
        boolean result;
        
        if (l == r) {
            if (list.get(l) == num) {
                return true;
            } else {
                return false;
            }
        }
        
        int mid = (r+l) / 2;
        
        if (list.get(mid) == num) {
            return true;
        }  else if (list.get(mid) > num) {
            result = binarySearch(list, num, l, mid-1);
        } else {
            result = binarySearch(list, num, mid+1, r);
        }
        
        return result;
    }
}