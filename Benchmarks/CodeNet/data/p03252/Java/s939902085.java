import java.util.*;

class StrTrans {
    private final String s, t;
    private final int sLength;
    private HashMap<Character, ArrayList<Integer> > sMap, tMap;
    private HashSet<ArrayList<Integer> > sIndexSet, tIndexSet;
    private static final String YES = "Yes", NO = "No";

    StrTrans(String s, String t) {
        this.s = s;
        this.t = t;
        this.sLength = s.length();
    }

    private void mapValuesToSet(boolean is_s) {
        HashMap<Character, ArrayList<Integer> > strMap = is_s ? sMap : tMap;
        HashSet <ArrayList<Integer> > indexSet = new HashSet<>();

        for (ArrayList<Integer> arr : strMap.values()) {
            indexSet.add(arr);
        }

        if (is_s) {
            sIndexSet = indexSet;
        } else {
            tIndexSet = indexSet;
        }
    }

    private void mapIndexesToChar(boolean is_s) {
        String str = is_s ? this.s : this.t;
        HashMap<Character, ArrayList<Integer> > strMap = new HashMap<>();

        for (int i = 0; i < sLength; i++) {
            char c = str.charAt(i);
            if (strMap.get(c) == null) {
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(i);
                strMap.put(c, arr);
            } else {
                strMap.get(c).add(i);
            }
        }

        if (is_s) {
            sMap = strMap;
        } else {
            tMap = strMap;
        }
    }

    private void judge() {
        boolean is_s = true;
        boolean reached_last_check = true;

        mapIndexesToChar(is_s);
        mapIndexesToChar(!is_s);

        mapValuesToSet(is_s);
        mapValuesToSet(!is_s);

        for (ArrayList<Integer> arr : sIndexSet) {
            if (tIndexSet.contains(arr)) {
                tIndexSet.remove(arr);
            } else {
                reached_last_check = false;
                break;
            }
        }

        if (reached_last_check && this.tIndexSet.isEmpty()) {
            System.out.println(YES);
        } else {
            System.out.println(NO);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        StrTrans st = new StrTrans(s, t);
        st.judge();
    }
}