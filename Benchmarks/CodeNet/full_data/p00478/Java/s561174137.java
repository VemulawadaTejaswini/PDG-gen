import java.util.Scanner;
//0555
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int n=sc.nextInt();
        int c=0;
        while(n-->0) {
            String t=sc.next();
            t+=t.substring(0,s.length()-1);
            if(t.indexOf(s)>=0) {
                c++;
            }
        }
        System.out.println(c);
    }
}
