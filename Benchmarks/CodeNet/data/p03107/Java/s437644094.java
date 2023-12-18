import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char[] chars = s.toCharArray();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            list.add(chars[i]);
        }

        while (true) {
            List<Character> newList = new ArrayList<>();
            boolean updated = false;
            for (int i = 0; i < list.size(); i++) {

                if (i == list.size() - 1) {
                    newList.add(list.get(i));
                } else if ((list.get(i) == '0' && list.get(i + 1)== '1') || (list.get(i) == '1' && list.get(i + 1)== '0')) {
                    updated = true;
                    i++;
                } else {
                    newList.add(list.get(i));
                }
            }
            if (updated) {
                list = newList;
            } else {
                break;
            }
        }
        System.out.println(chars.length - list.size());
    }

}