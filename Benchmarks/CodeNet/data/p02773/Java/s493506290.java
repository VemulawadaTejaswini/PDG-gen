import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        Set<String> set = new HashSet<>();
        List<String> stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
            if (!set.contains(s[i])) {
                stringList.add(s[i]);
                integerList.add(1);
            } else {
                integerList.set(stringList.indexOf(s[i]), integerList.get(stringList.indexOf(s[i])) + 1);
            }
            set.add(s[i]);
        }
        int max = integerList.get(0);
        for (int i : integerList) {
            if (max < i) {
                max = i;
            }
        }
        List<Integer> indexList = new ArrayList<>();
        for (int i = 0; i < integerList.size(); i++) {
            if (max == integerList.get(i)) {
                indexList.add(i);
            }
        }
        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < indexList.size(); i++) {
            resultList.add(stringList.get(indexList.get(i)));
        }
        for (int i = 0; i < resultList.size(); i++) {
            for (int j = resultList.size() - 1; j > i; j--) {
                if (resultList.get(j - 1).compareTo(resultList.get(j)) > 0) {
                    String memory = resultList.get(j - 1);
                    resultList.set(j - 1, resultList.get(j));
                    resultList.set(j, memory);
                }
            }
        }
        for (String string : resultList) {
            System.out.println(string);
        }
        sc.close();
    }
}