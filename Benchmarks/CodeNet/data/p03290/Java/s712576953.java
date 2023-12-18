import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        //Scanner cin = new Scanner(new FileReader("src\\AtcoderContest0805\\task2-test-input.txt"));
        Scanner cin = new Scanner(System.in);
        int totalNum = cin.nextInt();
        int targetSum = cin.nextInt();
        int[] quesNum = new int[totalNum];
        int[] bonues = new int[totalNum];

        for (int i=0;i<totalNum;i++){
            quesNum[i] = cin.nextInt();
            bonues[i] = cin.nextInt();
        }

        int[] fullAnswerScore = new int[totalNum];

        for (int i=0;i<totalNum;i++) {
            fullAnswerScore[i] = (i+1)*100*quesNum[i]+bonues[i];
        }
        int[] used = new int[totalNum];
        int res = 0;
        while (targetSum>0) {

            int[] everyQuesScore = new int[totalNum];
            int mark = 0;
            for (int i=0;i<totalNum;i++){
                if (fullAnswerScore[i]<targetSum&&used[i]==0) {everyQuesScore[i] = fullAnswerScore[i]/quesNum[i];mark=1;}
                else if (used[i]==1) everyQuesScore[i] = 0;
                else everyQuesScore[i] = (i+1)*100;
            }
            int notSuffCount = Integer.MAX_VALUE;
            if (mark==0) {
                //System.out.println("here");
                for (int i=0;i<totalNum;i++) {
                    int tempNum = 0;
                    while (true) {
                        if (tempNum*(i+1)*100>=targetSum) {
                            break;
                        }
                        else tempNum++;
                    }
                    if (tempNum<notSuffCount) notSuffCount = tempNum;
                    if (quesNum[i]<notSuffCount) notSuffCount = quesNum[i];
                    //System.out.println(notSuffCount);
                }
                res+=notSuffCount;
                //System.out.println("res1 "+res);
                break;
            }
            System.out.println(Arrays.toString(everyQuesScore));
            int max = 0;
            int pos = 0;
            for (int i=0;i<totalNum;i++) {
                if (everyQuesScore[i]>max) {
                    max = everyQuesScore[i];
                    pos = i;
                }
            }
            used[pos] = 1;
            //System.out.println("pos "+pos);
            if (fullAnswerScore[pos]>targetSum){
                int tempNum = 1;
                while (true) {
                    if (tempNum*(pos+1)*100>=targetSum) {
                        res+=tempNum;
                        targetSum = 0;
                        break;
                    }
                    else tempNum++;
                }
            }
            else {
                targetSum-=fullAnswerScore[pos];
                res+=quesNum[pos];
            }
            //System.out.println("remained "+targetSum);

        }
        System.out.println(res);

    }

}