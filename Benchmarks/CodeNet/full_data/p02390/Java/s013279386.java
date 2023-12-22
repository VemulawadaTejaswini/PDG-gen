import java.util.Scanner;
class Main{
    int h,m,s;
    public void kozueteacher() {
    Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        h = y /3600;
        m = ( y - h * 3600) / 60;
        s = y - (h * 3600) - (m * 60);
            System.out.println(h + ":" + m + ":" + s);
    }
    public static void main(String[] args) {
        new Main().kozueteacher();
    }
} 