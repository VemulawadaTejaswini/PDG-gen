import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        String brChange;
        while (true){
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            brChange = br.readLine();
            
            if(brChange.length() < 1200){
                break;
            }
        }
        //文字列反転(大文字に変換)
        String upChar = brChange.toUpperCase();
    
        // List<String> beforeChar = new ArrayList<String>();
        List<Character> afterCharList = new ArrayList<Character>();
        
        //文字列を文字としてリストに格納
        for(int i=0 ;i<upChar.length(); i++){
            char aaa = upChar.charAt(i);
            afterCharList.add(i,aaa);
        } 
        
        for(int i=0; i<brChange.length(); i++){
            if(brChange.charAt(i) == upChar.charAt(i)){
                String aaa = String.valueOf(brChange.charAt(i));
                String bbb = aaa.toLowerCase();     //小文字に変換
                char[] c = bbb.toCharArray();
                afterCharList.set(i,c[0]);
            }
        }
        
        String ABCDE = "";
        for(int a=0; a<afterCharList.size(); a++){
            ABCDE = ABCDE + afterCharList.get(a);
        }
        // System.out.println("\n\n" + "変更前の文字列→" + brChange);
        System.out.println(ABCDE );
    }
}

