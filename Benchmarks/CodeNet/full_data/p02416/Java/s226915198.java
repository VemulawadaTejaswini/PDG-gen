import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            String x = input.next();
            if (x.equals("0")){
                break;
            }
            int result = 0;
            for (int i = 0; i < x.length(); i++){
                char c = x.charAt(i);
                result += (int)c-48;
            }
            System.out.println(result);
        }
    }
}
