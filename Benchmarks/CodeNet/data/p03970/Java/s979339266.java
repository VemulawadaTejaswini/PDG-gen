class CF2016qualB_A{
    public static void main(String[] args){
        String s = "CODEFESTIVAL2016";
        String input = new java.util.Scanner(System.in).next();
        int i=0;
        int ans = 0;
        while(i<s.length()){
            if(s.charAt(i) != input.charAt(i)){
                ans++;
            }
            i++;
        }
        System.out.printf("%d\n", ans);
    }
}