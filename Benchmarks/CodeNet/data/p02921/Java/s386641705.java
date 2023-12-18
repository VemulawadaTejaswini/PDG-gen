import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] a = sc.next().toCharArray();
        char[] b = sc.next().toCharArray();

        int res = 0;
        for(int i=0; i<3; i++) {
            if(a[i]==b[i]) res++;
        }
        System.out.println(res);


    }
}
