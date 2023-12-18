class Main {
    public static void main(String[] args) {
        String o = "xyz";
        String e = "abc";
        int sumLength = o.length() + e.length();
        char[] marged = new char[sumLength];
        for (int i = 0; i < sumLength; i++) {
            if (i % 2 == 0) {
                marged[i] = o.charAt(i/2);
            } else {
                marged[i] = e.charAt(i/2);
            }
        }
      	System.out.println(new String(marged));
    }
}