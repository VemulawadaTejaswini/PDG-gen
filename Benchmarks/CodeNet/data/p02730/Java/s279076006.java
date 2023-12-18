import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // input String
        // 長さ N の文字列 S は回文
        // 1 文字目から (N-1)/2 文字目は回文
        // (N+3)/2 文字目から N 文字目は回文
        Scanner sc = new Scanner(System.in);
        String testStr = sc.nextLine();
        int strLength = testStr.length();
        int smallEnd = (strLength-1)/2;
        int bigStart = (strLength+3)/2;
        List<String> charList = new ArrayList<>();
        for(int i = 0;i+1 < strLength;i++){
            charList.add(testStr.substring(i, i+1));
            if(i+1 == smallEnd){
                for(int j = 0; j < smallEnd/2; j++){
                    if(!charList.get(j).equals(charList.get(smallEnd-j-1))){
                        System.out.println("No");
                        return;
                    }
                }
            }
        }
        charList.add(testStr.substring(strLength-1, strLength));
        for(int j = 0; j < (strLength-bigStart)/2; j++){
            if(!charList.get(bigStart+j-1).equals(charList.get(strLength-j-1))){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}