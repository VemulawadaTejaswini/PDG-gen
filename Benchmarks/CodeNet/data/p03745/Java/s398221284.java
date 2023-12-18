
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

        List<Integer> a = new ArrayList<Integer>();
        for(int i = 0;i<n;i++){
            a.add(sc.nextInt());
        }

        int[] count = {0,0};

        int state = -1;//0:新しく作る場合の最初 1:単調増加 2:単調現象 3:等しい -1:はじめ
        int tmpNum = 0;
        for(int i=0;i<n;i++){
            switch(state){
                case -1:
                    tmpNum = a.get(i);
                    state = 0;
                    break;
                case 0:
                    if(tmpNum - a.get(i) < 0){
                        state = 1;
                    }else if(tmpNum - a.get(i) > 0){
                        state = 2;
                    }else{
                        state = 3;
                    }
                    tmpNum = a.get(i);
                    break;
                case 1:
                    if(a.get(i)-tmpNum >= 0){
                        tmpNum = a.get(i);
                    }else{
                        state = 0;
                        tmpNum = a.get(i);
                        count[0]++;
                    }
                    break;
                case 2:
                    if(a.get(i)-tmpNum <= 0){
                        tmpNum = a.get(i);
                    }else{
                        state = 0;
                        tmpNum = a.get(i);
                        count[0]++;
                    }
                    break;
                case 3:
                    if(a.get(i)-tmpNum > 0){
                        tmpNum = a.get(i);
                        state = 1;
                    }else if (a.get(i)-tmpNum < 0){
                        tmpNum = a.get(i);
                        state = 2;
                    }
                    break;
            }
        }
        count[0]++;
        state = -1;
        for(int i=n-1;i>=0;i--){
            switch(state){
                case -1:
                    tmpNum = a.get(i);
                    state = 0;
                    break;
                case 0:
                    if(tmpNum - a.get(i) < 0){
                        state = 1;
                    }else if(tmpNum - a.get(i) > 0){
                        state = 2;
                    }else{
                        state = 3;
                    }
                    tmpNum = a.get(i);
                    break;
                case 1:
                    if(a.get(i)-tmpNum >= 0){
                        tmpNum = a.get(i);
                    }else{
                        state = 0;
                        tmpNum = a.get(i);
                        count[1]++;
                    }
                    break;
                case 2:
                    if(a.get(i)-tmpNum <= 0){
                        tmpNum = a.get(i);
                    }else{
                        state = 0;
                        tmpNum = a.get(i);
                        count[1]++;
                    }
                    break;
                case 3:
                    if(a.get(i)-tmpNum<0){
                        tmpNum = a.get(i);
                        state = 1;
                    }else if (a.get(i)-tmpNum>0){
                        tmpNum = a.get(i);
                        state = 2;
                    }
                    break;
            }
        }
        count[1]++;

        System.out.println(Math.min(count[0],count[1]));
    }
}