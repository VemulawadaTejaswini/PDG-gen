import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int reverse = reverse(N);
        if(N == reverse){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    private static int reverse(int s){
        int length = String.valueOf(s).length();
        char[] ch = new char[length];
        for(int i = 0; i < length; i++){
            ch[i] = String.valueOf(s).charAt(i);
        }
        if(length % 2 == 0){
            for(int i = 0; i < length/2; i++){
                char change = ch[i];
                ch[i] = ch[length -1 - i];
                ch[length - 1 - i] = change;
            }
        }else{
            for(int i = 0; i < length/2; i++){
                char change = ch[i];
                ch[i] = ch[length -1 - i];
                ch[length - 1 - i] = change;
            }
        }
        String string = "";
        for(int i = 0; i < length; i++){
            string = string + String.valueOf(ch[i]);
        }
        //System.out.println(string);
        int str = Integer.parseInt(string);
        return str;
    }
}