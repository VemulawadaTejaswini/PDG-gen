package AtCoder.AtCoderBeginnerContest101;

import java.util.Scanner;

public class Main {
        public static void main(String[] args){
            Scanner sr = new Scanner(System.in);
            String inputLine = sr.nextLine();
            Integer K = Integer.valueOf(inputLine);
            int count = 0;
            int n = 1;
            while (count != K) {
                boolean sunukeCheckFlag = true;
                for (int m =n+1; m <=30000; m++){
                    if (nPerSn(n) <= nPerSn(m)){
                        continue;
                    }else{
                        sunukeCheckFlag = false;
                        break;
                    }
                }
                if (sunukeCheckFlag){
                    System.out.println(n);
                    count++;
                    n++;
                }else {
                    n++;
                }
            }
        }
        public static double nPerSn(int num){

            double Sn = 0;
            int cNum = num;
            while (cNum != 0){
                Sn += (cNum % 10);
                cNum /= 10;
            }
            return num / Sn;
        }
}
