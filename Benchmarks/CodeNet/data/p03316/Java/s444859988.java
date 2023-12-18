import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int result = 0;
        for (int i = 1; i<=a.length(); i++) {
            int toridasi = Integer.parseInt(a.substring(i - 1, i));
            int hai = 0;
            result += toridasi;
        }
        if((Integer.parseInt(a)%result) == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
