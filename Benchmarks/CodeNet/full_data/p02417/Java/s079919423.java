import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] alpha = new int [26];
        String s;
        while(sc.hasNextLine()){
            s = sc.nextLine();
            s = s.toLowerCase();
            char[] s_ch = new char[s.length()];
            for(int i = 0;i < s.length();i++){
                s_ch[i] = s.charAt(i);
                if(s_ch[i]-'a'>=0&& s_ch[i] - 'a' < 26){
                    alpha[s_ch[i]-'a']++;
                }
            }
            
        }
        for(int i = 0;i<26;i++){
            System.out.printf("%c : %d%n",'a'+i,alpha[i]);
        }
        sc.close();
    }
}
