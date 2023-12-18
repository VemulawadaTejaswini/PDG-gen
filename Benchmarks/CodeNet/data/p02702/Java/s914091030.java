import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int a = 0;
        for(int i = 0; i < s.length(); i++){
            for(int j = i + 1; j < s.length(); j++){
                if(Long.parseLong(s.substring(i, j)) % 2019 == 0){
                    a++;
                }
            }
        }
        if(a == 0){
            System.out.println(0);
        }else{
            System.out.println(a + 1);
        }
    }
}