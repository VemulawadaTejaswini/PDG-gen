import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        al.add(a);
        al.add(b);
        al.add(c);
        Collections.sort(al);
        System.out.println(al.get(0) + al.get(1));
    }
}