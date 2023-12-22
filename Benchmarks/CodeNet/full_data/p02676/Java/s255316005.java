import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int K =scan.nextInt();
        String S=scan.next();

        scan.close();
        if(K<=S.length()){
        System.out.println(S.substring(0, K)+"...");
        }else if(K>S.length()){
            System.out.println(S.subSequence(0, S.length()));
        }
    }
}