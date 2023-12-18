import java.util.Scanner;

public class Main {
    static String[] str;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        str = in.next().split("");

        String formula;
        int ans;
        for(int i=0; i < Math.pow(2,3); i++){
            formula = str[0];
            ans = Integer.parseInt(str[0]);
            for(int j = 0; j < 3; j++){
                if((1&i>>j) == 0){
                    formula = formula + "+" + str[j+1];
                    ans += Integer.parseInt(str[j+1]);
                }else{
                    formula = formula + "-" + str[j+1];
                    ans -= Integer.parseInt(str[j+1]);
                }
            }
            if(ans == 7){
                System.out.println(formula + "=7");
                break;
            }
        }
    }
}