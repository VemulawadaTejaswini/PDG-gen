public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = sc.nextLine();
        if(s.equals(s1.substring(0,s1.length()-1))){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}