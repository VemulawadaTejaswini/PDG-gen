import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner Ent = new Scanner(System.in);
        int P =  Ent.nextInt();
        int Q =  Ent.nextInt();
        int R =  Ent.nextInt();
        int res1 = P + Q;
        int res2 = R + Q;
        int res3 = R + P;
        System.out.println(Math.min(res1,Math.min(res2,res3)));
    }
}