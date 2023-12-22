import java.util.Scanner;
public class Main {
    static int[] tel;

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int k = scan.nextInt();
        tel = new int[N+1];
        for (int i = 1; i <= N; i++) {
            tel[i] = scan.nextInt();
        }

        System.out.println(getTown(1, k));
    }

    public static int getTown(int pos,int count) {
        if(count<=0){return pos;}
        count--;
        pos = tel[pos];
        pos  = getTown(pos,count);
        return pos;
    }
}
