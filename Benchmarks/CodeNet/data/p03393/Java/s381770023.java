
import java.util.Scanner;


public class Main {
    
    boolean alphabet[] = new boolean[26];
    
    public static void main(String[] args) {
        Main m = new Main();
    }
    
    public Main(){
        Scanner s = new Scanner(System.in);
        char[] str = s.next().toCharArray();
        char[] ans = new char[26];
        int length = str.length;
        for(int i = 0; i < str.length; i++)
            ans[i] = str[i];
        for(int i = 0; i < 26; i++)
            alphabet[i] = true;
        for(int i = 0; i < str.length; i++)
            alphabet[str[i] - 'a'] = false;
        
        for(int j = 0; j < 26; j++){
            for(int i = 0; i < 26; i++){
                if(alphabet[i]){
                    if(str.length == length){
                        ans[length] = (char) ('a'+i);
                        System.out.println(ans);
                        return;
                    }
                    else if(str[length] < 'a' + i){
                        ans[length] = (char) ('a'+i);
                        System.out.println(new String(ans, 0, length+1));
                        return;
                    }
                }
            }
            alphabet[ans[length-1]-'a'] = true;
            ans[length - 1] = ' ';
            length --;
        }
        System.out.println(-1);
    }
}
