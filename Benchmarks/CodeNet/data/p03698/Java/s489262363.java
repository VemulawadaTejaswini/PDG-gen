import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        String s = scan.next();
        
        int[] alf = new int[26];
        
        for(int i=0;i<s.length();i++)
        {
            alf[s.charAt(i)-'a']++;
        }
        
        for(int i=0;i<alf.length;i++)
        {
            if(alf[i]>1)
            {
                System.out.println("no");
                return;
            }
            
        }
        System.out.println("yes");
    }
}