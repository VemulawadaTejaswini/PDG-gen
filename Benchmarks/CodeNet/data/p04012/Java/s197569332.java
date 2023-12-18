import java.util.*;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] count = new int[26];
        //int A = 'a';
        boolean test = true;
        
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            count[c-97]++;
        }
        for(int i=0; i<26; i++){
            if(count[i]%2 != 0){
                test = false;
                break;
            }
        }
        if(test){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        //System.out.println(A);
    }
}