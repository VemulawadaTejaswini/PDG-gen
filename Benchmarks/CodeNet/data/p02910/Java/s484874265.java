import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] cArray = s.toCharArray();
        
        String result = "Yes";
        
        for(int i=0;i<cArray.length;i++) {
            if(i%2==0) {
                //奇数文字目
                if(cArray[i]=='L') {
                    result = "No";
                }
            }else {
                //偶数文字目
                if(cArray[i]=='R') {
                    result = "No";
                }
            }
        }
        
        System.out.println(result);

    }

}
