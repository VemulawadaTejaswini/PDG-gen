import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt() ;

        int[] a = new int[N];
        boolean[] pushFlg = new boolean[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int lightButton = 1;
        boolean relightFlg = false ;
        int count = 0;
        while(!relightFlg){
            if (lightButton == 2) {
                break;
            }
            pushFlg[lightButton - 1] = true;
            lightButton = a[lightButton - 1];
            count ++;
            if(pushFlg[lightButton - 1]){
                relightFlg = true;
            }
        }
        System.out.println(relightFlg ? -1 : count);

    }

}
