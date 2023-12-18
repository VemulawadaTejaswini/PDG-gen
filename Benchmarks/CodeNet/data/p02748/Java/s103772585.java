import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //冷蔵庫種類
        int refnum = sc.nextInt();
        //電子レンジ種類
        int micnum = sc.nextInt();
        //割引券
        int dknum = sc.nextInt();
		//冷蔵庫の最小コスト
        int ref[] = new int[refnum];
        int refmin = 100001;
        for(int i = 0; i < refnum; i++){
        	ref[i] = sc.nextInt();
            if(ref[i] < refmin){
            	refmin = ref[i];
            }
        }
        //電子レンジ最小コスト
        int mic[] = new int[micnum];
        int micmin = 100001;
        for(int i = 0; i < micnum; i++){
        	mic[i] = sc.nextInt();
            if(mic[i] < micmin){
            	micmin = mic[i];
            }
        }
        //割引券最小コスト
        int dk[] = new int[3];
        int dkmin = 100001;
        for(int i = 0; i < dknum; i++){
        	for(int j = 0; j < 3; j++){
            	dk[j] = sc.nextInt();
            }
            if(dkmin > ref[dk[0] - 1] + mic[dk[1] - 1] - dk[2]){
            	dkmin = ref[dk[0] - 1] + mic[dk[1] -1] - dk[2];
            }
        }
        //割引券有りと無しでどちらが安いか
        if(refmin + micmin <= dkmin){
        	System.out.println(refmin + micmin);
        }else if(refmin + micmin > dkmin){
        	System.out.println(dkmin);
        }
    }
}