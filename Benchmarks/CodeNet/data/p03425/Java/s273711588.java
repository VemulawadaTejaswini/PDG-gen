import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int N =sc.nextInt();
        String s[]  = new String[N];
        long m=0;
        long a=0;
        long r=0;
        long c=0;
        long h=0;
        for (int i=0;i<N;i++) {
            s[i] = sc.next();
            if(s[i].charAt(0) == 'M') {
                m++;
            }
            if(s[i].charAt(0) =='A') {
                a++;
            }
            if(s[i].charAt(0) =='R') {
                r++;
            }
            if(s[i].charAt(0) =='C') {
                c++;
            }
            if(s[i].charAt(0)=='H') {
                h++;
            }
        }
        long ans =m*a*r + m*a*c + m*a*h + m*r*c + m*r*h + m*c*h
                +a*r*c + a*r*h + a*c*h + r*c*h;
        System.out.println(ans);

    }
}