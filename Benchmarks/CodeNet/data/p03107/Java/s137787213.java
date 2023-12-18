import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //int N = str.length();
        //char[] c = str.toCharArray();
        int count = 0;
        boolean test = true;

        while(test && str.length()>1){
        for(int i=1; i<str.length(); i++){
            if(i==str.length()-1){
                test = false;
            }
            if(str.charAt(i-1) != str.charAt(i)){
                str = str.substring(0,i-1) + str.substring(i+1,str.length());
                //System.out.println(str.length());
                count += 2;
                break;
            }
        }
        }
        System.out.println(count);
    }
}