import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] charArray = sc.next().toCharArray();

        char one =charArray[0];
        int oneCount = 1;
        int twoCount = 0;
        int[] secondCharIndexone = new int[3];
        int index = 0;

        for (int i=1; i<4; i++){
            if (charArray[i] == one){
                oneCount++;
            }else {
                secondCharIndexone[index] = i;
                index++;
            }
        }

        if (oneCount ==2 && charArray[secondCharIndexone[0]] == charArray[secondCharIndexone[1]]){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}