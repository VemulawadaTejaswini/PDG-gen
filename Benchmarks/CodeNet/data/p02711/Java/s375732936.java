import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        char[] charStr = new char[3];
        boolean judge = false;
        for(int i = 0; i<3; i++){
            charStr[i] = num.charAt(i);
            if(charStr[i] == '7'){
                judge = true;
            }  
        }
        System.out.println(judge ? "Yes" : "No");
    }
}