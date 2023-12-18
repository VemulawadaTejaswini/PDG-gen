import java.util.*;

class Main{
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int[] path = new int[3];
        path[0] = sc.nextInt();
        path[1] = sc.nextInt();
        path[2] = sc.nextInt();
        Arrays.sort(path);
        System.out.println(path[0]+path[1]);
    }
}