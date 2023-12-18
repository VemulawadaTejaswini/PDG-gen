import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // input S
        // 文字列 S の子文字列を何種類に分割できるかを出力する
        Scanner sc = new Scanner(System.in);
        String inStr = sc.nextLine();
        List<String> subStr = new ArrayList<>();
        int resNum = 0;
        for(int i = 1; i < inStr.length(); i++){
            subStr.add(inStr.substring(0, i));
            //残りの文字列を追加する
            int retrStart = 0;
            boolean isRetrNext = true;
            boolean isRetrieve = true;
            for(int j = i; j < inStr.length(); j++){
                if(isRetrNext){
                    retrStart = j;
                    isRetrNext = false;
                }
                String tempStr = inStr.substring(retrStart, j + 1);
                for(int k = 0; k < subStr.size(); k++){
                    if(subStr.get(k).equals(tempStr)){
                        isRetrieve = false;
                    }
                }
                if(isRetrieve){
                    subStr.add(tempStr);
                    isRetrNext = true;
                }
                isRetrieve = true;
            }
            if(isRetrNext && resNum < subStr.size()) {
                resNum = subStr.size();
            }
            subStr.clear();
        }
        System.out.println(resNum);
    }
}
