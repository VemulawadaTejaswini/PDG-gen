import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long k = sc.nextLong();


        List<Long> A = new ArrayList<>();
        List<Long> B = new ArrayList<>();

        for(int i = 0; i < n; i++){
            long A_i = sc.nextLong();
            A.add(A_i);
        }

        for(int i = 0; i < m; i++){
            long B_i = sc.nextLong();
            B.add(B_i);
        }

        int ans = 0;

        
        while(true){

            //本が無くなったら終わり
            if(A.size() == 0 && B.size() == 0){
                break;
            }

            if(A.size() > 0 && B.size() == 0) {//Aしか残ってない
                long initialA = A.get(0);
                if(k >= initialA){
                    k = k - initialA;
                    A.remove(0);
                    ans++;
                }else {//Aを読めなくなったら終わり
                    break;
                }
            }else if(A.size() == 0 && B.size() > 0){//Bしか残ってない
                long initialB = B.get(0);
                if(k >= initialB){
                    k = k - initialB;
                    B.remove(0);
                    ans++;
                }else {//Bを読めなくなったら終わり
                    break;
                }
            }else { //両方残っている
                long initialA = A.get(0);
                long initialB = B.get(0);

                //どの本を読むことも不可能になったら終わり
                if(k < initialA && k < initialB){
                    break;
                }

                //ここに来た時点でどちらかは読める
                //AとB小さい方を選ぶ
                if(initialA <= initialB){//Aのが小さい
                    k = k - initialA;
                    A.remove(0);
                    ans++;
                }else{//Bのが小さい
                    k = k - initialB;
                    B.remove(0);
                    ans++;
                }
            }

        }
        System.out.println(ans);
    }
}
