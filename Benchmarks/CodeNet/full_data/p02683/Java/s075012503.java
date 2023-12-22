import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int wantLearnAlgo = sc.nextInt();
        int needUnderstand = sc.nextInt();
        int[] value = new int[n];
        int[][] increaseAbility = new int[n][wantLearnAlgo];
        for(int i = 0; i<n; i++){
            value[i] = sc.nextInt();
            for(int j = 0; j<wantLearnAlgo; j++){
                increaseAbility[i][j] = sc.nextInt();
            }
        }


        int[] sumValue = new int[(int)Math.pow(2, wantLearnAlgo)];
        int[][] allChoice = new int[(int)Math.pow(2, wantLearnAlgo)][wantLearnAlgo];

        for(int i = 0; i<(int)Math.pow(2, wantLearnAlgo); i++){
            for(int j = 0; j<n; j++){
                if( (1 & i >> j) == 1){
                    for(int k = 0; k<wantLearnAlgo; k++){
                        allChoice[i][k] += increaseAbility[j][k];
                    }
                    sumValue[i] += value[j];
                }
            }
        }

        List<Integer> successValue = new ArrayList<Integer>();

        for(int i = 0; i<(int)Math.pow(2, wantLearnAlgo); i++){
            boolean judge = true;
            for(int j = 0; j<wantLearnAlgo; j++){
                if(allChoice[i][j] < needUnderstand){
                    judge = false;
                }
            }
            if(judge){
                successValue.add(sumValue[i]);
            }
        }

        if(successValue.size() == 0){
            System.out.println("-1");
        }
        else{
            Collections.sort(successValue);
            System.out.println(successValue.get(0));
        }
    }
}