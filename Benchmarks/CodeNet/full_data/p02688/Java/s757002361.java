import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int M = scn.nextInt();
        boolean[] nusuke = new boolean[N];
        //M回ループ
        for(int i=0;i<M;i++){
            int d = scn.nextInt();
            int a = 0;
            //d回ループ
            for(int k=0;k<d;k++){
                a = scn.nextInt();
                nusuke[a-1] = true;
            }
        }

        int cnt = 0;

        for(int i=0;i<M;i++){
            if(nusuke[i] == false){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}