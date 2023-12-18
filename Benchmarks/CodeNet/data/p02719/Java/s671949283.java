import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);

        long n = input.nextLong();
        long k = input.nextLong();

        if(n>k){
            long rem =n%k;

            if(rem >0){
                rem =k%rem;
            }
            System.out.println(rem);
        }else{
            //k i bigger
            System.out.println(n);
        }

    }
}
