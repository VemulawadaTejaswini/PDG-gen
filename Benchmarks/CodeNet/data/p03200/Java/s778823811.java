import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int[] sumB = new int[s.length];
        
        int count = 0;
        if(s[0] == 'B') sumB[0] = 1;
        for(int i = 1;i < s.length;i++) {
            if(s[i] == 'B') sumB[i] = sumB[i - 1] + 1;
            else {
                sumB[i] = sumB[i - 1];
                count += sumB[i];
            }
        }
    
        System.out.println(count);
    }
}
