import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int h = S / 3600;
        int hn = S % 3600;
        int m = hn / 60;
        int s = hn % 60;
        System.out.println(h + ":" + m + ":" + s);
        
        sc.close();
    }
}
