import java.util.Scanner;

public class AtCoder_0130_A {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println((a<b?0:10));
        s.close();
    }

}