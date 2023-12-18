import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S=sc.next();
        final String a="CODEFESTIVAL2016";
        int count = 0;
        for(int i=0;i<16;i++){
            if(S.charAt(i)!=a.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
