
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String[] s = new String[n];
        for(int i=0; i<n; i++){
            s[i] = sort(sc.next());
        }
        // for(int i=0;i<n;i++){System.out.println(s[i]);}
        Map<String, Integer> cntStr = new HashMap<String,Integer>();
        int result = 0;
        int cnt;
        for(int i=0; i<n; i++){
            if(cntStr.containsKey(s[i])){
                cnt = cntStr.get(s[i]);
                result += cnt;
                cntStr.put(s[i], cnt+1);
            }else{
                cntStr.put(s[i], 1);
                continue;
            }
        }
        System.out.println(result);
    }

    private static void _sort(char[] d, int left, int right){
        if(left>=right){return;}
        int p = d[(left+right)/2];
        int l=left, r=right;
        char tmp;
        while(l<r){
            while(d[l]<p){l++;}
            while(d[r]>p){r--;}
            if(l<=r){
                tmp = d[l];
                d[l] = d[r];
                d[r] = tmp;  
                l++; r--;          
            }
            _sort(d, left, r);
            _sort(d, l, right);
        }
    }
    private static String sort(String str){
        char[] tmp = str.toCharArray();
        _sort(tmp, 0, str.length()-1);
        return new String(tmp);
    }
}