import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String str = scanner.next();

        int count1 = 0;
        int count2 = 0;
        boolean flag = false;
        for(int i = 0; i < size; i++) {
            if(!flag && str.charAt(i) == '#') flag = true;
            if(flag) {
                if(str.charAt(i) == '.') count1++;
                if(str.charAt(i) == '#') count2++;
            }
        }

        int count = count1 > count2 ? count2 : count1;

        System.out.println(count);
    }
}