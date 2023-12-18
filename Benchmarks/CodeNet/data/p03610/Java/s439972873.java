import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String[] s = sc.next().split("");
        
        for(int i=1; i<=s.length; i++){
            if(i % 2 == 1){
                System.out.print(s[i-1]);
            }
        }
    }
}