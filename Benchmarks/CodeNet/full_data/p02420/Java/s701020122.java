import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> strList = new ArrayList<String>();
        while(sc.hasNext()){
            String str = sc.next();
            if(str.equals("-")){
                break;
            }
            int m = sc.nextInt();
            for(int i = 0; i < m; i++){
                int h = sc.nextInt();
                str = str.substring(h) + str.substring(0, h);
            }
            strList.add(str);
        }
        for(int i = 0; i < strList.size(); i++){
            System.out.println(strList.get(i));
        }
    }
}
