import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        for(int i = 0; i < a; i++) {
            str1.append(b);
        }
        for(int j = 0; j < b; j++) {
            str2.append(a);
        }
        int flg = str1.compareTo(str2);
        if(flg == 1) {
            System.out.println(str1);
        } else if(flg == -1) {
            System.out.println(str2);
        } else {
            System.out.println(str1);
        }
        
    }
}
