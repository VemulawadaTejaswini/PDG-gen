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

        int moves = s.length()-2-max;
        if (moves==0)
            moves = 1;
        if (moves<0)
            moves = 0;
        System.out.println(moves%2!=0? "First" : "Second");

        /*if (s.length()-2<max)
            System.out.println("Second");
        else if (s.length()-2==max && max%2!=0)
            System.out.println("First");
        else if (s.length()-2==max && max%2==0)
            System.out.println("Second");
        else
            System.out.println((s.length()-1-max)%2!=0 || s.length()-2==max && max%2!=0? "First" : "Second");*/
    }
}
