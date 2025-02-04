import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        int middleScore = 0;    //??????????¨?????????°
        int finalScore = 0;     //??????????¨?????????°
        int revengeScore = 0;   //???????¨?????????°

        try{

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            while(true){
                String input = br.readLine();
                String[] strArray = input.split(" ");

                middleScore = Integer.parseInt(strArray[0]);
                finalScore = Integer.parseInt(strArray[1]);
                revengeScore = Integer.parseInt(strArray[2]);

//              ??????????????????????????¨???-1?????¨??????????????????
                if(middleScore == -1 && finalScore == -1 && revengeScore == -1){
                    break;
                }

                System.out.println(grading(middleScore, finalScore, revengeScore));
            }
        }catch (Exception e) {
            System.err.println(e);
        }
    }

    private static String grading(int middleScore, int finalScore, int revengeScore){

        int sum = middleScore + finalScore;
        String grade = null;

        if(middleScore == -1 || finalScore == -1){
            grade.equals("F");
        }

        if(80 <= sum){
            grade.equals("A");

        }else if(65 <= sum){
            grade.equals("B");

        }else if(50 <= sum){
            grade.equals("C");

        }else if(30 <= sum){
            if(50 <= revengeScore){
                grade.equals("C");
            }else{
                grade.equals("D");
            }
        }else{
            grade.equals("F");
        }

        return grade;
    }
}