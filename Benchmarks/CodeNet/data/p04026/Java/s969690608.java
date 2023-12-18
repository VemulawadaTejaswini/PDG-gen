import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] str = sc.next().toCharArray();
        int l = -1;
        int r = -1;

        for(int i = 0 ; i < str.length-2 ; i++){
            if(str[i] == str[i+1]){
                l = i+1;
                r = i+2;
            }
            if(str[i] == str[i+2]){
                l = i+1;
                r = i+3;
            }
        }
        if(str[str.length-2] == str[str.length-1]){
            l = str.length-1;
            r = str.length;
        }

        System.out.println(""+l+" "+r);
    }
}
