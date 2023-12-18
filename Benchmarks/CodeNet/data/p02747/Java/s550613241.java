public class Main {
    static Scanner sc  = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.next();
        int res = s.indexOf("hi");

        if(res != -1){
            if (s.charAt(res+1) == 'i') {
                System.out.println("Yes");
            }
        } else {
            System.out.println("No");
        }
    }
}