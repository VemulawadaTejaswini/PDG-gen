import java.util.Scanner;

public class Main {

    public static void main (String [] args){
        Scanner  sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int cnt=0;
        for (int i=1;i<=N;i++){
            int total=0;
            String s= String.valueOf(i);
            String slist[] = s.split("");
            for (int j =0;j<slist.length;j++){
                total += Integer.parseInt(slist[j]);
            }
            if (total >= A && total <= B){
                cnt += i;
            }
        }
        System.out.println(cnt);
    }
}
