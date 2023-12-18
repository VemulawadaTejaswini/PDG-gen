import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        List<String> list = new ArrayList<>();
        int length = S.length();

        int previousLength = 0;
        int stringCount = 0;
        String previousTxt = "";
        String before = "";
        String after = "";
        for (int i = 0;i<length; i++){
            before = String.valueOf(S.charAt(stringCount));
            after = String.valueOf(S.charAt(stringCount+1));

            if (previousLength > 1){
                previousTxt = before;
                list.add(before);
                previousLength =1;
                stringCount++;
            }else if (previousTxt == after){
                list.add(before+after);
                stringCount = stringCount +2;
                previousLength =2;
            }
            if (stringCount ==S.length()){
                break;
            }
        }
        System.out.println(list.size());


    }
}

