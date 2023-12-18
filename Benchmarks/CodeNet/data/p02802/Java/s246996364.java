import java.util.*;
import java.lang.*;

class Main {
    public static void main (String[] args)  {
        Scanner in = new Scanner(System.in);
        int numProblems = in.nextInt();
        int numSubmissions = in.nextInt();
        Map<Integer, String> map = new HashMap<Integer, String>();
        int correctAnswers=0;
        int penalties=0;
        for (int i=0;i<numSubmissions;i++){
            int nextTask=in.nextInt();
            String nextResult = in.next();
            if (map.containsKey(nextTask)){
                if(!map.get(nextTask).equals("AC")){
                    if(nextResult.equals("WA")){
                        penalties++;
                    }
                    if(nextResult.equals("AC")){
                        map.put(nextTask, nextResult);
                        correctAnswers++;
                    }
                }
            }
            else {
                map.put(nextTask, nextResult);
                if (nextResult.equals("WA")) {
                    penalties++;
                } else if (nextResult.equals("AC")) {
                    correctAnswers++;
                }
            }
        }
        System.out.print(correctAnswers);
        System.out.print(" "+penalties);


    }
}

