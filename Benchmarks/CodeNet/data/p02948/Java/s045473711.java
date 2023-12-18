import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nums = sc.nextLine();
        String[] numArray = nums.split(" ");
        List<String> strList = new ArrayList<>();
        for(int i=0; i<Integer.parseInt(numArray[0]); i++) {
            strList.add(sc.nextLine());
        }
        check(numArray, strList);
    }

    public static void check(String[] num, List<String> strList) {
        int cnt = Integer.parseInt(num[0]);
        int days = Integer.parseInt(num[1]);
        int ret = 0;
        int max = 0;
        int j=0;
        int tmp = 0;
        for(int i=days;i>=0;i--) {
            for(String a : strList) {
                String[] str = a.split(" ");
                int day = Integer.parseInt(str[0]);
                int sal = Integer.parseInt(str[1]);
                if (i >= day && max <= sal) {
                    max = sal;
                    tmp = j;
                }
                j++;
            }
            ret += max;
            max = 0;
            j=0;
            if(strList.size() > tmp) {
                strList.remove(tmp);
            }
            tmp = 0;
        }
        System.out.println(ret);
    }


}