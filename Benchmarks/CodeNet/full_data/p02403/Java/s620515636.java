import java.text.DecimalFormat;
import java.util.*;

public class Main {
    public static void main(String[] args)  throws java.io.IOException{
        Scanner sc = new Scanner(System.in);
        while(true){
            int h = sc.nextInt();
            int w = sc.nextInt();
            if(h==0&&w==0){
                break;
            }
            String elem = "";
            for (int i=1;i<=w;i++){
                elem+="#";
            }
            for (int i = 1;i<=h;i++){
                System.out.println(elem);
            }
            System.out.println("");
        }
        sc.close();
    }
}