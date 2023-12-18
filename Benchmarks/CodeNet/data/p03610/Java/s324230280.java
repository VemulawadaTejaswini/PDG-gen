import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] array = s.split("");
        String ans = "";

        for(int i = 0; i < s.length(); i += 2){
            ans += array[i];
        }
        System.out.println(ans);
    }
}