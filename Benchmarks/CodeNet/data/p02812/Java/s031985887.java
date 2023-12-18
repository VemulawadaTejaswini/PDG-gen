import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
       String S;
       int counter=0;

        S=sc.next();

        for (int i=0;i<N;i++){
            if (S.charAt(i)=='C')
                if (S.charAt(i-1)=='B')
                    if (S.charAt(i-2)=='A')
                        counter++;
        }
        System.out.println(counter);


    }
}
