import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String T = sc.nextLine();
        int diff = S.length() - T.length();
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<diff+1;i++){
            int temp = T.length();
            for(int j = 0;j<T.length();j++){
                if(S.charAt(i+j) == T.charAt(j)){
                    temp--;
                }
            }
            min = Math.min(min,temp);
        }
        System.out.println(min);
    }
}