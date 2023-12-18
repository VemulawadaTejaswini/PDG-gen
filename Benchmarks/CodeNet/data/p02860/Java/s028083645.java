import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wordNum = sc.nextInt();
        sc.nextLine();
        String words = sc.nextLine();
        char[] charText = new char[wordNum];
        int halfNum = wordNum/2;

        if(wordNum%2!=0){
            System.out.println("No");
        }else{
            charText=words.toCharArray();
            for(int j=0;j<halfNum;j++){
                if(charText[j]!=charText[j+halfNum]){
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("Yes");
        }
    }
}

