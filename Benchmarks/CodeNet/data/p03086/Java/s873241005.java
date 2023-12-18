import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int current = 0;
        int max = 0;
        for(int i = 0 ; i<s.length(); i++){
            char x = s.charAt(i);
            if(x=='A' || x=='C'|| x=='G'||x=='T'){
                current++;
            }else{
                current = 0;
            }
            max = Math.max(current,max);
        }
        System.out.println(max);

    }
}