import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        int zeroCount = 0;
        int oneCount = 0;
        
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == '1') {
                oneCount++;
            } else {
                zeroCount++;
            }
        }
        int count = (Math.min(oneCount, zeroCount)) * 2;
        
        System.out.println(count);

    }

}