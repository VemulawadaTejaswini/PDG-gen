public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int ans = 0;
        for(int i = 0; i < 3; i++){
            if(s.charAt(i) == '1') ans++;
        }
        System.out.println(ans);
    }
}
