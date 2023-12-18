import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        int N = 0;

        List<Integer> fstList = new ArrayList<Integer>();

        List<Integer> scdList = new ArrayList<Integer>();

        Scanner scan = new Scanner(System.in);

        N = scan.nextInt();

        for(int i = 0; i < N ; i ++){

            if( 0 == (i % 2)){
                fstList.add(scan.nextInt());
            }
            else{
                scdList.add(scan.nextInt());
            }
        }

        scan.close();

        int ans = 0;

        int fstMostNum = 0;
        int fstCnt = 0;
        int fstCntTemp = 0;


        for(int i =0; i < N/2 ; i++){
            //ループの最初でリストはリセット
            List<Integer> fstListTemp = new ArrayList<Integer>(fstList);
            fstCntTemp = 0;

            while(true){
                //数字の数を計算する。
                if(!(fstListTemp.remove(fstList.get(i)))){
                    break;
                }
                else{
                    //リストにまだ単語があればカウント＋
                    fstCntTemp++;

                    //最も出現した数字の更新
                    if(fstCnt <= fstCntTemp){
                        fstMostNum = fstList.get(i);
                        fstCnt = fstCntTemp;
                    }
                }
            }
        }

        int scdMostNum = 0;
        int scdCnt = 0;
        int scdCntTemp = 0;

        for(int i =1; i < N/2 ; i++){
            //ループの最初でリストはリセット
            List<Integer> scdListTemp = new ArrayList<Integer>(scdList);
            scdCntTemp = 0;

            while(true){
                //数字の数を計算する。
                if(!(scdListTemp.remove(scdList.get(i)))){
                    break;
                }
                else{
                    //リストにまだ単語があればカウント＋
                    scdCntTemp++;

                    //最も出現した数字の更新
                    if(scdCnt <= scdCntTemp){
                        scdMostNum = scdList.get(i);
                        scdCnt = scdCntTemp;
                    }
                }
            }
        }


        if(fstMostNum == scdMostNum){
            ans = fstList.size();
        }
        else{
            ans += (fstList.size() - fstCnt) + (fstList.size() - scdCnt);
        }

        System.out.println(ans);

    }
}