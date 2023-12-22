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
        while(true){
            try{
                text = sc.next();
                Lower_text = text.toLowerCase();
                str = str + Lower_text;
            }catch(Exception e){
                break;
            }        
            i++;
            /*textlen = text.length();
            testtext = text.substring(textlen-1);
            if(testtext.equals(".")) break;*///Judging wether text contains "." or not            
        }
        char[] c = str.toCharArray();
        int[] alphabet;
        alphabet = new int[26];
        
        for(count=0;count<str.length();count++){
            if((c[count]-'a')>= 0 && (c[count]-'a')<=25){
                alphabet[(c[count]-'a')]++;
                //System.out.println(c[count]);
            }            
        }
        for(count=0;count<26;count++){
            System.out.println((char)(count+'a') + " : " + alphabet[count]);
        }
        sc.close();
    }
}
