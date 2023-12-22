import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        String str = sc.next();

        if(str.length() <= k){
            System.out.println(str);
        }
        else{
            char[] strChar = new char[k];
            for(int i = 0; i<k; i++){
                strChar[i] = str.charAt(i);
            }
            String makeStr = "";
            for(int j = 0; j<k; j++){
                makeStr += strChar[j];
            }
            System.out.println(makeStr + "...");
        }
    }
}