import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        char[] h = {'L', 'R'};

        for(int i = 0; i < s.length; i++) {
        	if(s[i] == h[i%2]) {
        		System.out.println("No");
        		return;
        	}
        }

        System.out.println("Yes");

        return;
    }

}