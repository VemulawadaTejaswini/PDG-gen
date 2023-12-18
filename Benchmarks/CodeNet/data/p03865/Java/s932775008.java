import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();
        int[] a = new int[26];
        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i)-97]++;
        }
        int max = 1;
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, a[i]);
        }
            System.out.println(Math.max(0, s.length()-2-max)%2!=0 || s.length()-2==max && max%2!=0? "First" : "Second");
    }
}
