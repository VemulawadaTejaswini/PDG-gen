import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.next();
        char[] ch = t.toCharArray();
        for(int i = 0;i < ch.length;i++){
            if(ch[i] == '?')
                ch[i] = 'D';
        }
        for(char ans:ch){
            System.out.print(ans);
        }    
    }
}