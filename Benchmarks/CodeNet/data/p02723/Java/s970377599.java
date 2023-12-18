import java.util.Scanner;
public class D630 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i =0;
        while(n!=0){
            if((n&1)!=0) i++;
            n>>=1;
        }
        System.out.println(i);
    }
}