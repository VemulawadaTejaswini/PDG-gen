import java.util.Scanner;

class Solution {
    
    private static final int N = 50000;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String c = s.nextLine();
        if (Character.isUpperCase(c.charAt(0))) {
           System.out.println("A");
        } else {
            System.out.println("a");
        }
    }
}
