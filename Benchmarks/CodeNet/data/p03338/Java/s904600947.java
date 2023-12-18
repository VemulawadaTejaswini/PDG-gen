import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int ans = 0;
        for (int i=1;i<s.length();i++){
            String s1 = s.substring(0,i);
            String s2 = s.substring(i);
            