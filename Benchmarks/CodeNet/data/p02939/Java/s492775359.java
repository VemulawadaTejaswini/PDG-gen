import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        //List<String> list = new ArrayList<>();
        int length = S.length();

        int previousLength = 2;
        int stringCount = 0;
        String previousTxt = "";
        String before = "";
        String after = "";
        String afterafter="";
        int count=0;
        int count2 = 0;
        for (int i = 0;i<length*2; i++){
            before = String.valueOf(S.charAt(stringCount));
            after = String.valueOf(S.charAt(stringCount+1));

            if (previousLength > 1||!previousTxt.equals(before)){
                //System.out.println(before);
                previousTxt = before;

                previousLength =1;
                stringCount++;
                count++;
            }else {
                //System.out.println(before+after);
                stringCount = stringCount +2;
                previousTxt = before+after;
                previousLength =2;
                count++;
            }
            System.out.println(previousTxt);
            if (stringCount+1 == length){
                if (String.valueOf(S.charAt(stringCount-3)+S.charAt(stringCount-2)).equals(String.valueOf(S.charAt(stringCount-1)+S.charAt(stringCount)))){
                    count--;
                   // System.out.println("111");
                    break;
                }
                else if (previousTxt.equals(after)){
                    break;
                }else {
                    count++;
                    break;
                }
            }else if (stringCount == length){
                if (previousTxt.length()==1){
                    count++;
                }
                break;
            }else if (stringCount+2==length){
                if(previousTxt.equals(String.valueOf(S.charAt(stringCount)+S.charAt(stringCount+1)))){
                    count--;
                    //System.out.println("222");
                    break;
                }
            }
        }
         previousLength = 0;
         stringCount = 0;
         previousTxt = String.valueOf(S.charAt(stringCount));
         before = "";
         after = "";
         afterafter="";

        for (int i = 0;i<length*2; i++){
            before = String.valueOf(S.charAt(stringCount));
            after = String.valueOf(S.charAt(stringCount+1));

            if (previousLength > 1||!previousTxt.equals(before)){
                previousTxt = before;
                previousLength =1;
                stringCount++;
                count2++;
            }else {
                //System.out.println(before+after);
                stringCount = stringCount +2;
                previousTxt = before+after;
                previousLength =2;
                count2++;
            }
            System.out.println(previousTxt);
            if (stringCount+1 == length){
                if (String.valueOf(S.charAt(stringCount-3)+S.charAt(stringCount-2)).equals(String.valueOf(S.charAt(stringCount-1)+S.charAt(stringCount)))){
                    count2--;
                   // System.out.println("333");
                    break;
                }
                else if (previousTxt.equals(after)){

                    break;
                }else {
                    count2++;
                    break;
                }
            }else if (stringCount == length){
                if (previousTxt.length()==1){
                    count2++;
                }

                break;
            }else if (stringCount+2==length){
                if(previousTxt.equals(String.valueOf(S.charAt(stringCount)+S.charAt(stringCount+1)))){
                    count2--;
                    //System.out.println("444");
                    break;

                }}}
        System.out.println(Math.max(count,count2));
        //System.out.println("count:"+count+"count2:"+count2);




    }
}

