import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        long mod=0;
        if(L<2019 && 2019 > R){
            mod =  ((2019L - R) * (2019L - R+1)) % 2019;
        }
        if(L> 2019 && 2019 < R){
            mod =  ((L-2019L ) * (L-2019L+1)) % 2019;
        }


        System.out.println(mod);

    }

}
