import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();

        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        for (int i=0; i<s.length; i++) {
            if (mapS.containsKey(s[i])) {
                mapS.put(s[i], mapS.get(s[i]) + 1);
            } else {
                mapS.put(s[i], 1);
            }
        }
        for (int i=0; i<t.length; i++) {
            if (mapT.containsKey(t[i])) {
                mapT.put(t[i], mapT.get(t[i]) + 1);
            } else {
                mapT.put(t[i], 1);
            }
        }

//        System.out.print(mapS);
//        System.out.print(mapT);

        List<Integer> listS = new ArrayList<>();
        for (int v: mapS.values()) {
            listS.add(v);
        }
        Collections.sort(listS);
        List<Integer> listT = new ArrayList<>();
        for (int v: mapT.values()) {
            listT.add(v);
        }
        Collections.sort(listT);

//        System.out.print(listS);
//        System.out.print(listT);

        if (listS.size() != listT.size()) {
            System.out.print("No");
            return;
        }

        for (int i=0; i<listS.size(); i++) {
            int ss = listS.get(i);
            int tt = listT.get(i);
            if (ss != tt) {
                System.out.print("No");
                return;
            }
        }

        System.out.print("Yes");

    }


}

