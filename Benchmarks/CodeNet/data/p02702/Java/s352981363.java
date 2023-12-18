class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sinit = sc.next(); // 文字列
        String a;
        int cnt = 0;
        int index = 0;

        for (int i = 1; i < 100; i++) {
            a = String.valueOf(i * 2019);
            String s = sinit;
            if (s.contains(a)) {
                for (int b = 0; b < s.length() - a.length(); b++) {
                    if (s.indexOf(a,b) != -1){
                        cnt++;
                        s = s.substring(index+a.length());
                    }
                }
            }
        }
        System.out.println(cnt);


    }
}