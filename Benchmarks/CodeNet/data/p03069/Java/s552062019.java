import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int size = scanner.nextInt();
        String str = scanner.next();
        int size = str.length();
        boolean lastFlag = str.charAt(size-1) == '#' ? true : false;
        int breakInt = -1;
        int index = 0;
        
        int right = 0;
        boolean firstFlag = true;
        boolean secondFlag = true;
        boolean thirdFlag = false;
        int addCount = 0;
        int checkInt = 0;
        for(int i = size-1; i >=0; i--) {
            if(firstFlag && str.charAt(i) == '.') {
                breakInt = size - index;
                firstFlag = false;
                continue;
            }
            if(!firstFlag && str.charAt(i) == '#') {
                right = size - 1;
                addCount = index+1;
                secondFlag = false;
                thirdFlag = true;
            }
            if(thirdFlag && str.charAt(i) == '.') {
                right = size - 1;
                checkInt = size - index;
                break;
            }
            index++;
        }

        int count1 = 0;
        int count2 = 0;
        boolean flag = false;
        for(int i = 0; i < size; i++) {
            if(!flag && str.charAt(i) == '#') flag = true;
            if(flag) {
                if(i == checkInt && breakInt > right) {
                    count2 += (breakInt - right) + 1;
                }
                if(i == breakInt && breakInt < right) {
                    break;
                }
                if(str.charAt(i) == '.') count1++;
                if(str.charAt(i) == '#') count2++;
            }
        }

        int count = count1 > count2 ? count2 : count1;

        System.out.println(count);
    }
}