import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = "";  
        String text;
        String Lower_text;
        int count = 0;
        int textlen;
        int i=0;
        String testtext;        
        while(i<300){
            text = sc.next();
            Lower_text = text.toLowerCase();
            str = str + Lower_text;
            i++;
            /*textlen = text.length();
            testtext = text.substring(textlen-1);
            if(testtext.equals(".")) break;*///Judging wether text contains "." or not            
        }
        char[] c = str.toCharArray();
        int[] alphabet;
        alphabet = new int[26];
        
        for(count=0;count<str.length()-1;count++){
            alphabet[(c[count]-'a')]++;            
        }
        for(count=0;count<26;count++){
            System.out.println((char)(count+'a') + " : " + alphabet[count]);
        }
        sc.close();
    }
}
