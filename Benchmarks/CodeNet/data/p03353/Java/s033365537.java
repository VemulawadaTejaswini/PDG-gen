import java.util.*;
import java.io.*;
 
public class Main{
    public static void main(String[] args){
        Main m = new Main();
        m.input();
    }
 
    public void input(){
        Scanner sc = new Scanner(System.in);
        String list = "abcdefghijklmnopqrstuvwxyz";
        String s =sc.next();
        int ord = sc.nextInt();
        ArrayList<String> words = new ArrayList<String>();
        for(int i = 0 ; i <= list.length(); i++){
            for(int j = 0; j < s.length(); j++){
                if(list.charAt(i) == s.charAt(j)){
                    for(int k = 1; k <= s.length() - j; k++){
                        String tmp = s.substring(j, j + k);
                        if(!words.contains(tmp)){
                            words.add(tmp);
                        }
                    }
                }
            }
            if(words.size() >= ord){
                break;
            }
        }
        Collections.sort(words);
        System.out.println(words.get(ord - 1));
        
    }
    
}