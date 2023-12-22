import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
 
        int h = sc.nextInt();
        int w = sc.nextInt();
        for (; h != 0 || w != 0;) {
            StringBuffer oddline = new StringBuffer();
            StringBuffer evenline = new StringBuffer();
            for (int i = 0; i < w; i++) {
                if (i % 2 == 1) {
                    oddline.append('.');
                    evenline.append('#');
                } else {
                    oddline.append('#');
                    evenline.append('.');
                }
            }
            for (int i = 0; i < h; i++) {
                if (i % 2 == 1) {
                    System.out.println(evenline);
                } else {
                    System.out.println(oddline);
                }
            }
            System.out.println("");
             
            h = sc.nextInt();
            w = sc.nextInt();
        }
         
        sc.close();
    }
}