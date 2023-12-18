import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();

        int[] n = new int[S.length()];
        int count = 0;
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == 'W'){
                count++;
                n[i] = count;
            }
        }
        int sum = 0;
        for(int i = 0; i < S.length(); i++){
            if(n[i] != 0){
                sum += i-n[i]+1;
            }
        }
        System.out.println(sum);
    }
}