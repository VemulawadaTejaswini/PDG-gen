import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // input N S
        // 文字列長　N である文字列 S について、 S = T + T なる T から構成されるなら Yes 、そうでなければ No
        Scanner sc = new Scanner(System.in);
        int strLen = sc.nextInt();
        String str = sc.next();
        if(strLen % 2 == 0){
            String firstStr = str.substring(0, strLen / 2);
            String lastStr = str.substring(strLen / 2, strLen);
            if(firstStr.equals(lastStr)){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
