import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int top = 1;
        int num9 = 0;
        for(int i=0; i<k; i++){
            String s = "" + top;
            for(int j=0; j<num9; j++){
                s = s + "9";
            }
            System.out.println(s);
            top++;
            if(top == 10){
                top = 1;
                num9++;
            }
        }
    }
}