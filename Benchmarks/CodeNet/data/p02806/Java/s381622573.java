import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String[] kyoku = new String[N];
        int[] kyoku_num = new int[N];
        for(int i=0;i<N;i++){
            kyoku[i]=scan.next();
            kyoku_num[i]=scan.nextInt();
        }
        String a = scan.next();
        int ans = 0;
        boolean flg = false;
        for(int i=0;i<N;i++){
            if(flg){
                ans+=kyoku_num[i];
            }
            if(a.equals(kyoku[i])){
                flg=true;
            }
        }
        System.out.println(ans);
    }
}
