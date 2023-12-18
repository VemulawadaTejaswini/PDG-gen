package sw;

import java.util.Scanner;

class Sw {

    public static void main(String[] args) {
       String a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();
        b = sc.nextLine();
        c = sc.nextLine();
        if ((a.charAt(a.length()-1) == (b.charAt(0)))&&((b.charAt(b.length()-1))==(c.charAt(0)))) {
            System.out.println("YES");
            
        }
        else{
            System.out.println("NO");
        }
    }
    
}
