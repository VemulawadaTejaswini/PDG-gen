import java.util.Scanner;
class Main{
    int x,h,m,m1,s,s1;  
    public void yatary() {
        Scanner sc = new Scanner(System.in);
        x =sc.nextInt();
        h =x / 3600; 
        m =x % 3600;
        m1 = m / 60;
        s = x % 3600;
        s1 = s % 60;
        System.out.println(h + ":" + m1 + ":" + s1);
    }
    public static void main(String[] args){
    new Main().yatary();
    }
}