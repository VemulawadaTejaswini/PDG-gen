
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int strNum = sc.nextInt();
        int strLen = sc.nextInt();
        List<String> strList = scanList(sc,strNum);


        System.out.println(execute(strNum,strLen,strList));

    }

    public static String execute(int strNum, int strLen, List<String> strList) {
        strList.sort(Comparator.naturalOrder());
        StringBuffer buf = new StringBuffer();
        for(String str : strList){
            buf.append(str);
        }

        return buf.toString();
    }

    public static List<String> scanList(Scanner sc,int num){
        List<String> scanList = new ArrayList<>();
        for(int i = 0; i <= num ; i++){
            scanList.add(sc.nextLine());
        }
        return scanList;
    }
}
