import java.util.*;

public class Main {


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        long h = sc.nextInt();
        long w = sc.nextInt();

        if (h*w%2==0) {
            System.out.print(h*w/2);
        } else {
            System.out.print(h*w/2+1);
        }

    }
}

