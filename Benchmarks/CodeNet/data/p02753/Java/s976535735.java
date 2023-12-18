public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean f = true;
        char temp;
        temp = s.charAt(0);

        for(int i=1;i<s.length();i++){
            if(temp == s.charAt(i)){
                continue;
            }else{
                System.out.println("Yes");
                System.exit(0);
            }
        }
        System.out.println("No");
    }

}