import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int count = 0;
        while (count<s.length()-1){
            if (s.charAt(count)!=s.charAt(count+1)){
                String s1 = s.substring(0,count);
                String s2 = s.substring(count);
                s = s1+s2;
            }else {
                count++;
            }
        }
        System.out.println(n-s.length());
    }
}
