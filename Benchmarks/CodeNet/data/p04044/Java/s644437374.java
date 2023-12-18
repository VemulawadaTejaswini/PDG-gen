import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int L = scan.nextInt();
        String str[] = new String[N];
        String ans = "";

        Scanner scan2 = new Scanner(System.in);
        for(int i=0; i<N; i++){
            str[i] = scan2.nextLine();
        }

        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                    return o1.compareTo(o2);
                }
        });
        for(int i=0; i<N; i++){
            ans = ans + str[i];
        }
    System.out.println(ans);
    }
}
