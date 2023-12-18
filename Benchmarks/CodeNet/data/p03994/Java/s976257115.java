import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char[] c = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            c[i] = s.charAt(i);
        }
        int K = sc.nextInt();
        sc.close();
    
        int index = 0;
        while(index < s.length()){
            char target = c[index];
            if(target != 'a'){
                if(diff(target) <= K){
                    c[index] = 'a';
                    K -= diff(target);
                } 
            }
            index++;
        }
        if(K != 0){
            c[s.length()-1] += (K%26);
        }
        for(int i = 0; i < s.length(); i++){
            System.out.print(c[i]);
        }
    }
    static int diff(char c){
        return 26 - c + 'a';
    }
}