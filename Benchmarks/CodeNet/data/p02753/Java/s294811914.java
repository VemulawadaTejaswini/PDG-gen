import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] c = s.toCharArray();

        int countA = 0;
        int countB = 0;

        for (char ch : c) {
            if (ch == 'A') {
                countA++;
            } else {
                countB++;
            }
        }

        if(countA!=0 && countB!=0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}