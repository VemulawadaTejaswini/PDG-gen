import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        for(;;){
            String x = scan.next();
            int X = Integer.parseInt(x);
            if(X == 0){
                break;
            }else{
                int sum = 0;
                for(int i = 0; i < x.length(); i++){
                    char s = x.charAt(i);
                    //System.out.println(s);
                    //int S = Integer.parseInt(s);
                    int S = Character.getNumericValue(s);
                    //int S = (int)s;
                    //System.out.println("S = " + S);
                    sum += S;
                    //System.out.println("sum =" + sum);
                }
                System.out.println(sum);
            }
        }
    }
}