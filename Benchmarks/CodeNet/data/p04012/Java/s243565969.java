import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.next();
        char [] str = new char [w.length()];
        
        for(int i=0; i<w.length(); i++){
            str[i] = w.charAt(i);
        }
        
        Arrays.sort(str);
        char tmp = str[0];
        int count =1;
        boolean judge = true;
        for(int i=1; i<w.length(); i++){
            if(tmp == str[i]){
                count++;
            }else{
                if(count%2 == 1){
                    judge = false;
                    break;
                }
                count = 1;
                tmp = str[i];
            }
        }
        
        if(judge) System.out.println("Yes");
        else System.out.println("No");
    }
}