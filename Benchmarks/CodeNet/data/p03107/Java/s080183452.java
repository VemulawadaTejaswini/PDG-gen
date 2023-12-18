import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        char[] list;
        list = S.toCharArray();

        int result=0;
        while(true) {
            int removeCount = 0;
            char prevChar = 'x';
            int prevIndex = 0;
            for (int i = 0; i < list.length; i++) {
                if (list[i] == '1' || list[i] == '0') {
                    if (prevChar == 'x') {
                        prevChar = list[i];
                        prevIndex = i;
                        continue;
                    }
                    if (list[i] == prevChar) {
                        prevChar = list[i];
                        prevIndex = i;
                    } else {
                        list[i] = 'x';
                        list[prevIndex] = 'x';
                        prevChar = 'x';
                        removeCount++;
                        result += 2;
                    }
                }
            }
            if (removeCount == 0) break;


            String tmpString = "";
            for(int i=0; i<list.length; i++) {
                if (list[i] != 'x') tmpString+=String.valueOf(list[i]);
            }
            list = tmpString.toCharArray();
        }

        System.out.println(result);

    }

}