import java.util.*;
public class Main {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int y = sc.nextInt();
        List<Integer> a = Arrays.asList(1,3,5,7,8,10,12);
        List<Integer> b = Arrays.asList(4,6,9,11);
        if(a.contains(x)&&a.contains(y)) System.out.println("Yes");
        else if(b.contains(x)&&b.contains((y))) System.out.println("Yes");
        else if(x==2&&y==2) System.out.println("Yes");
        else System.out.println("No");
    }
}