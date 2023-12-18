import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a=scan.nextInt();
        int b=scan.nextInt();

        int ja=0,ab=0;
        int pass=0;
        String s=scan.next();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='a' ){
                if(pass<a+b) {
                    System.out.println("Yes");
                    ja++;
                    pass++;
                }
                else
                    System.out.println("No");
            }
            if(s.charAt(i)=='b' ){
                if(pass<a+b && ab<b) {
                    System.out.println("Yes");
                    ab++;
                    pass++;
                }
                else
                    System.out.println("No");

            }
            if(s.charAt(i)=='c')
                System.out.println("No");
        }

    }
}