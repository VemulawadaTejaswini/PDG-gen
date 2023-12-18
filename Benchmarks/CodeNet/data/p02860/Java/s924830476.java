import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        String s= sc.next();
        if(length % 2 != 0){
            System.out.println("No");
        } else{
            String a = s.substring(0, length / 2);
            String b = s.substring(length / 2, length);
            System.out.println(a.equals(b) ? "Yes" : "No")  ;
        }
        sc.close();
    }
}
