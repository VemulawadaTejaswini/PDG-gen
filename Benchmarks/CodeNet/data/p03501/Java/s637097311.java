import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();//駐車する時間
       int A = sc.nextInt();//時間当たりの駐車料金
       int B = sc.nextInt();//固定料金
       int zikanRyoukin = A * N;
       if(B > zikanRyoukin){
           System.out.println(zikanRyoukin);
       }else{
           System.out.println(B);
       }
    }
}
