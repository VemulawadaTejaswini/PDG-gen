import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt()*60;
        int m1 = sc.nextInt();
        int h2 = sc.nextInt()*60;
        int m2 = sc.nextInt();
        int k = sc.nextInt();
        int life = (h2+m2) - (h1+m1);    
        System.out.println(life-k);
    }
}