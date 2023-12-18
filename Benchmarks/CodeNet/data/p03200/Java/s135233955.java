import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();

        int num = 0;
        String str2 = "BW";


        while(str1.indexOf(str2) >= 0){
            str1.replace("BW", "WB");
            num ++;
        }

        System.out.println(num);
 
 
    }
}
