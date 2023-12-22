import java.lang.*; 
import java.util.*; 
class GFG 
{ 
    static final int MAX_CHAR = 26; 
    public static int minChanges(String S) 
    {  
        int n = S.length(); 
        if (n > MAX_CHAR) 
            return -1; 
        int dist_count = 0; 
        int count[] = new int[MAX_CHAR]; 
        for(int i = 0; i < MAX_CHAR; i++) 
            count[i] = 0; 
          
        for (int i = 0; i < n; i++) 
        { 
            if(count[S.charAt(i)-'a'] == 0) 
                dist_count++; 
            count[S.charAt(i)-'a']++; 
        } 
        return (n-dist_count); 
    } 

    public static void main (String[] args) { 
          
        String S = "aebaecedabbee"; 
          
        System.out.println(minChanges(S)); 
    } 
} 
  