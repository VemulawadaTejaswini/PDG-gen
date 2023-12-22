import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s=in.next();
        String t=in.next();
        int len=s.length();
        int window=t.length();
        int ans=0;
        for(int i=0;i<len-window;i++){
            int temp=0;
            for(int j=i,k=0;j<i+window && k<window;j++,k++){
                if(s.charAt(j)==t.charAt(k))
                temp++;
            }
            if(temp>ans)
            ans=temp;
        }
        System.out.println(window-ans);
    }
}
