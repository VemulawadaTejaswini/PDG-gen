import java.util.Scanner;

public class Main {

    public static void main(String args[] ) throws Exception {


        Scanner s = new Scanner(System.in);


        int N = s.nextInt();    // Reading input from STDIN

        int i=1;

        String result = "YES";
        int count = 0;
        while(i<=N){
            int p = s.nextInt();
            count += i!=p?1:0;

            if(count>2){
                result = "NO";
                break;
            }
            i++;
        }
        System.out.println(result);

    }
}
