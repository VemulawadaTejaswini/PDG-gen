

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputstr = br.readLine().trim().split(" ");
        int N = Integer.parseInt(inputstr[0]);
        int C = Integer.parseInt(inputstr[1]);
        double[][] stc = new double[N][2];
        for(int i=0; i<N; i++){
            inputstr = br.readLine().trim().split(" ");
            for(int j=0; j<2; j++){
                stc[i][j] = Double.parseDouble(inputstr[j]);
                if(j == 0) stc[i][0] -= 0.5;
            }
        }
        int num = 0;
        ArrayList recorder = new ArrayList();
        ArrayList ranges = new ArrayList();
        double[] range = new double[2];
        int flag1,flag2;
        for(int i=0; i<N; i++){
            flag1 = 1;
            for(Object obj1: recorder) {
                flag2 = 1;
                ranges = (ArrayList)obj1;
                for (Object obj : ranges) {
                    range = (double[]) obj;
                    if(!(stc[i][0] >= range[1] || stc[i][1] <= range[0])){
                        flag2 = 0;
                        break;
                    }
                }
                if(flag2 == 1){
                    ranges.add(stc[i].clone());
                    flag1 = 0;
                    break;
                }
            }
            if(flag1 == 1){
                ranges = new ArrayList();
                ranges.add(stc[i].clone());
                recorder.add(ranges);
                num++;
            }
        }
        System.out.println(recorder.size());

    }
}