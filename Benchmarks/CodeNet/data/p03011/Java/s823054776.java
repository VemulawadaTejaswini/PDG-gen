import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] t = new int[3];
        t[0] = sc.nextInt();
        t[1] = sc.nextInt();
        t[2] = sc.nextInt();
        Arrays.sort(t);
        Sysetm.out.println(t[0]+t[1]);
    }
}