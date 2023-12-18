import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        int r = 3;
        int s = 0;

        for(int i = 0;i < r;i++){
            if(x.charAt(i) == '1'){
                s++;
            }
        }
        System.out.println(s);
    }
}