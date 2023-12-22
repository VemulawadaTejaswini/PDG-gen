import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int i;
        String str = "1";
        int sum = 0;
        int value = 1;
        while (true) {
            str = sc.next();
            if(str.equals("0")){
                break;
            }
            for (i = 0; i < str.length(); i++) {
                str.charAt(i);
                value = str.charAt(i) -'0';
                sum += value;
            }
            System.out.println(sum);
            sum = 0;    
        }
        sc.close();
    }
}
