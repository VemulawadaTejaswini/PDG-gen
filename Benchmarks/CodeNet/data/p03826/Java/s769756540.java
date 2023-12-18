public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer A = Integer.parseInt(sc.next());
        Integer B = Integer.parseInt(sc.next());
        Integer C = Integer.parseInt(sc.next());
        Integer D = Integer.parseInt(sc.next());

        int s1 = A*B;
        int s2 = C*D;

        if(s1>s2) System.out.println(s1);
        else System.out.println(s2);

    }
}
