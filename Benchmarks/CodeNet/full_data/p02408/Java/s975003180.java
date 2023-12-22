import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        
        char[] markChar = {'S', 'H', 'C', 'D'};
        boolean[][] judgeCard = new boolean[4][13];
        
        MarkCard mc = new MarkCard();
        for(int i = 0; i < inputNumber; i++){
            char inputMark      = sc.next().charAt(0);             //文字入力
            int inputRankNumber = sc.nextInt();                 //1~13まで入力
            judgeCard[mc.checkMark(inputMark)][inputRankNumber-1] = true;
        }

        for(int markCount = 0; markCount < 4; markCount++){
            for(int rankCount = 0; rankCount < 13; rankCount++){
                //falseのものを出力する
                if(!judgeCard[markCount][rankCount]){               
                    System.out.print(markChar[markCount] + " " + (rankCount+1) + "\n");
                }
            }
        }
    }
}

class MarkCard{
    public int checkMark(char inputMark){
        switch(inputMark){
            case 'S':
                return 0;
            case 'H':
                return 1;
            case 'C':
                return 2;
            case 'D':
                return 3;
        }
        return -1;
    }
}
