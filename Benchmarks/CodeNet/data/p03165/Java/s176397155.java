import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        String t = sc.nextLine();
        
        int[][] lcs = new int[3030][3030];
        
        if(s.length() < t.length()){
            String tmp = s;
            s = t;
            t = tmp;
        }
        
        int slen = s.length();
        int tlen = t.length();
        for(int i=1; i<=slen; i++){
            for(int j=1; j<=tlen; j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    lcs[i][j] = lcs[i-1][j-1]+1;
                }else{
                    lcs[i][j] = Math.max(lcs[i][j-1], lcs[i-1][j]);
                }
            }
        }
        
        printLcs(s,t,lcs,slen,tlen);
        System.out.println("");
    }
    
    public static void printLcs(String s, String t, int[][] lcs, int i, int j){
        if(i==0 || j==0){
            return;
        }
        
        if(s.charAt(i-1) == t.charAt(j-1)){
            printLcs(s,t,lcs,i-1,j-1);
            System.out.print(s.charAt(i-1));
        }else{
            if(lcs[i-1][j] >= lcs[i][j-1]){
                printLcs(s,t,lcs,i-1,j);
            }else{
                printLcs(s,t,lcs,i,j-1);
            }
        }
        
    }
}
