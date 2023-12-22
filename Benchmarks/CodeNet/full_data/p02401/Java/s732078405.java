import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> result = new ArrayList<Integer>();
        String operand;
        int a, b;
        label:
            while(sc.hasNextLine()){
                a = sc.nextInt();
                operand = sc.next();
                b = sc.nextInt();
                if((operand.charAt(0) == '/') && (b == 0)){
                    System.out.println("ゼロ除算");
                    System.exit(0);
                }
                switch(operand.charAt(0)){
                case '+' :
                    result.add(a + b);
                    break;
                case '-' :
                    result.add(a - b);
                    break;
                case '*' :
                    result.add(a * b);
                    break;
                case '/' :
                    result.add(a / b);
                    break;
                case '?' :
                    break label;
                default:
                    System.out.println("不正なオペランド");
                }
            }
         
            for(int i = 0; i < result.size(); i++){
                System.out.println(result.get(i));
            }
        }
     
}
