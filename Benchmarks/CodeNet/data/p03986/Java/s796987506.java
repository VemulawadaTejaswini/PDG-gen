import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String str1 = null;
        String str2 = null;
        if (str.length() > 200){
            str1 = str.substring(0, str.length()/2);
            str2 = str.substring(str.length()/2);
        }

        if (str != null){
            for (int i = 0; i < 100000; i++){
                str = str.replaceAll("ST", "");
            }
        }else {
            while (str1.matches(".*ST.*")){
                str1 = str1.replaceAll("ST", "");
            }
            while (str2.matches(".*ST.*")){
                str2 = str2.replaceAll("ST", "");
            }
            str = str1 + str2;
            while (str.matches(".*ST.*")){
                str = str.replaceAll("ST", "");
            }
            
        }
        System.out.println(str.length());
    }
}