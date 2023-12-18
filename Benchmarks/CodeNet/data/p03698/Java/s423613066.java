import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String s = stdIn.next();

        char[] charArray = s.toCharArray();
        
        for (int i = 0; i < charArray.length; i++) {
            for (int j = charArray.length-1; i < j; j--) {
                if (charArray[i] == charArray[j]) {
                    no(); 
                } 
            }
        }
        yes();
    }
    
    static void yes() {
        System.out.println("yes");
    }
    static void no() {
        System.out.println("no");  
    }