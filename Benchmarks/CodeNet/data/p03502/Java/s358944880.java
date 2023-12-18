import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        String N = scan.next();
        
        String[] n = N.split("",0);
        int[] l = new int[10];
        
        for(int i=0;i<n.length;i++){
            l[i] = Intrger.perseInt(n[i]);
        }
        int ans = 0;
        for(int j=0;j<l.length;j++){
            ans += l[j];
        }
        
    }
}