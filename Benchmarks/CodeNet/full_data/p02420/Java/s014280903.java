import java.util.Scanner;
 
class Main {
    Scanner sc = new Scanner(System.in);
 
    public void run() {
        while(true){
 
            String s=sc.nextLine();
            if("-".equals(s))break;
            int count=sc.nextInt();
            for(int i=0;i<count;i++){
                int index=sc.nextInt();
                s=s.substring(index)+s.substring(0,index);
            }sc.nextLine();
            ln(s);
        }
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

