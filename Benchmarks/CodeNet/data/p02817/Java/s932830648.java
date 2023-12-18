class St {

    public static String merge(String s, String t) {
        if (s.length() == 0) {
            if (t.length() == 0) {
                return null;
            }
            return t;
        }
        if (t.length() == 0) {
            if (s.length() == 0) {
                return null;
            }
            return s;
        }
        return t + s;
    }

    public static void main(String[] args) {
        String s1 = "saff";
        String s2 = "daf";
        System.out.println(merge(s1, s2));
    }

}
