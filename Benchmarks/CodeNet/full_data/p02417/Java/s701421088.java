import java.util.Scanner;
 
public class Main{
    public static void main(String[] aaa){
        Scanner s = new Scanner(System.in);
        int[] count = new int[27];
        String st;
        char m;
        int i,j;
        while(s.hasNext()){
            st = s.next();
            for(i=0;i<st.length();i++){
                j=st.charAt(i);
                if(j-'a'>=0&&j-'a'<26)count[st.charAt(i)-'a']++;
                else if(j-'A'<26&&j-'A'>=0)count[st.charAt(i)-'A']++;
            }
        }
        for(i=0;i<26;i++){
            m = (char)('a'+i);
            System.out.println(m+" : "+count[i]);
        }
    }
}
