import java.io.*;
import java.util.*;


public class Main{

    public void run(){
        Scanner scan = new Scanner(System.in);
        while(true){
            int n = scan.nextInt();
            if(n == 0)
                break;

            boolean firstFlag = false;
            int first = 0;
            int last = 0;
            int tmpNum = 0;
            int latestNum = 0;
            String resultString = "";
            List<String> resultStringList = new ArrayList<>();
            for(int i = 0; i < n; i++){
                tmpNum = scan.nextInt();
                if(firstFlag == false){
                    first = tmpNum;
                    firstFlag = true;
                }
                else if(tmpNum - latestNum != 1){
                    resultStringList.add(first + "-" + latestNum);
                    first = tmpNum;
                }
                latestNum = tmpNum;
            }
            resultStringList.add(first + "-" + latestNum);
            System.out.println(String.join(" ", resultStringList));
        }
    }
    public static void main(String... args){
        new Main().run();
    }
}