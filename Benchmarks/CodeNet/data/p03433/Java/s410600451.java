import java.util.Scanner;

//2018-04-08
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        String ans = null;

        if (N%500 !=0 && (N%500)>A){
            ans ="No";
        }else {
            ans ="Yes";
        }

        System.out.println(ans);
    }
}