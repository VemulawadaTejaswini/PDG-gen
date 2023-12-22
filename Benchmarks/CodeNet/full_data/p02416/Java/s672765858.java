import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            String str = sc.next();
            if(str.equals("0")) break;
            char[] a = new char[str.length()];
            int sum = 0;
            for(int i=0;i<str.length();i++){
                a[i] = str.charAt(i);
                int b = a[i] - '0';
                sum +=b;
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
