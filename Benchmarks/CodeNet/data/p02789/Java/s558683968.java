import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner  s =  new Scanner(System.in);
        int numTest = s.nextInt();
        int numPassed = s.nextInt();
        System.out.println(numTest==numPassed?"Yes":"No");
        s.close();
    }
}