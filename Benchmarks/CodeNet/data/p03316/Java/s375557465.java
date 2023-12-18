import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        char[] num = new char[n.length()];
        int[] Num = new int[n.length()];
        int ans = 0;
        for(int i = 0;i < n.length();i++){
            num[i] = n.charAt(i);
            Num[i] = Character.getNumericValue(num[i]);
        }
        for(int i = 0;i < n.length();i++){
            ans += Num[i];
        }
        System.out.println(ans);
    }
}