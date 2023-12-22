import java.util.Scanner;
 
class Main {
    Scanner sc = new Scanner(System.in);
 
    int[] count = new int[26];
 
    public void run() {
        String s=sc.nextLine().toLowerCase();
        int count=0;
        while(true){
            String str=sc.next();
            if(s.equals(str.toLowerCase()))count++;
            if("END_OF_TEXT".equals(str))break;
        }
        ln(count);
    }
 
    public static void main(String[] args) {
        new Main().run();
    }
 
    public static void pr(Object o) {
        System.out.print(o);
    }
 
    public static void ln(Object o) {
        System.out.println(o);
    }
 
    public static void ln() {
        System.out.println();
    }
}
