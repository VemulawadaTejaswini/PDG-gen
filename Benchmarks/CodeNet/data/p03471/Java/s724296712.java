import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);
        int N = Integer.parseInt(s.next());
        int Y = Integer.parseInt(s.next());
        int[] a = new int[3];
        a[0] = (int)(Y / 10000);
        a[1] = (int)((Y%10000) / 5000);
        a[2] = (int)((Y%10000)%5000)/1000;
        if(a[0] + a[1] + a[2] == N){
            System.out.println(a[0]+" "+a[1]+" "+a[2]);
        }else{
            System.out.println("-1 -1 -1");
        }
    }
}
