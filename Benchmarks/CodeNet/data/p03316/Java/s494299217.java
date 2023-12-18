import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class Main{
    public static int sum =0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Long a =  sc.nextLong();
        String S = String.valueOf(a);
        Arrays.asList(LIBctoC(S.toCharArray())).forEach(c -> sum +=  c - 48);;
        Long b = sum + 0L;
        System.out.println((a%b==0)?"Yes":"No");
        sc.close();
    }

    public static Character[] LIBctoC(char[] c){
        int size = c.length;
        Character[] C = new Character[size];
        for (int i = 0;i<size;i++){
            C[i] = Character.valueOf(c[i]);
        }
        return C;
    }
}