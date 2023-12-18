import java.util.*;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        String S = sc.next();

        if(S.contains("##")){
            System.out.print("No");
            return;
        }else{
            if(C < D){
                System.out.print("Yes");
                return;
            }else{
                if(S.contains("...")){
                    System.out.print("Yes");
                }else{
                    System.out.print("No");
                }
            }
        }
