import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        
        // String[] charValue = new String[S.length()];
        
        
        for (int i = 0; i < S.length(); i++) {
            int charValue = S.charAt(i);
            if (charValue + N > 90) {
                charValue -= 26;
            }
            
            String next = String.valueOf((char)(charValue + N));
            System.out.print(next);
        }
        System.out.println();
    }
}