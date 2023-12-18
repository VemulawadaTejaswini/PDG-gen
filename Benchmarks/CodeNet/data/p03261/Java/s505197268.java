import java.util.*;
import java.io.*;

public class Main {
    public static boolean shiritori(String[] word){
        Set<String> announced = new HashSet<>();
        for(int n=0;n<word.length;n++){
        	if(announced.contains(word[n])) return false;
        	if(n>0 && (word[n].charAt(0)!= word[n-1].charAt(word[n-1].length()-1))) return false;
        	announced.add(word[n]);
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] word = new String[N];
        for(int n=0;n<N;n++) word[n]=sc.next();
        
        System.out.println(shiritori(word) ? "Yes" : "No");
    }
}