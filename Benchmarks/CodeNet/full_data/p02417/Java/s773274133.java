import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = "";  
        String text;
        String Lower_text;
        int count = 0;
        int textlen;
        String testtext;        
        while(true){
            text = sc.next();
            
            textlen = text.length();
            testtext = text.substring(textlen-1);
            if(testtext.equals(".")) break;//Judging wether text contains "." or not

            Lower_text = text.toLowerCase();
            str = str + Lower_text;
        }
        char[] c = str.toCharArray();
        int[] alphabet;
        alphabet = new int[26];
        for(count=0;count<str.length()-1;count++){
            if(c[count]-'a'>= 0  && c[count]-'a' <= 25 ){
                alphabet[(c[count]-'a')]++;
            }
        }
        for(count=0;count<26;count++){
            System.out.println((char)(count+'a') + " : " + alphabet[count]);
        }
        sc.close();
    }
}
