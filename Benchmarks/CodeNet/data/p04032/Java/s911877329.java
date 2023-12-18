import java.util.*;
public class Main {
    
    static int[] isBalanced(String s){
        int[] c = new int[256];
        int[] ch = new int[]{-1,-1};
        int len=s.length()/2,i=0;
        for (char o : s.toCharArray()) {
            c[(int)o]++;
            if(c[(int)o]>len) { ch[0]=0; ch[1]=i;  }
            i++;
        }
        return ch;
    }

    static void solve(){
        Scanner sc = new Scanner(System.in);
        int[] ch={-1,-1};
        boolean ok = false;
        String s = sc.next();
        int n = s.length();
        // O(n^2) Can we do better? Maybe..
        for (int i=0; i<n-1; i++) {
            for (int j=n; j>=i+2; j--) {
                ch = isBalanced(s.substring(i,j));
                ok=(ch[0]>-1&&ch[1]>-1);
                if(ok) { break; }
            }  
            if(ok) break;
        }   
        System.out.println((ok) ? (ch[0]+1)+" "+(ch[1]+1): "-1 -1");
        sc.close();
    }
    
    public static void main(String args[]) {
        solve();
    }

}   
