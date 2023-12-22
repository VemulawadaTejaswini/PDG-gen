import java.util.Scanner;
 
class Main {
    Scanner sc = new Scanner(System.in);
 
    public void run() {
        int c=sc.nextInt();
        int c1=0,c2=0;
        for(int i=0;i<c;i++){
            String s1=sc.next(),s2=sc.next();
            if(s1.compareTo(s2)>0){
                c1+=3;
            }else if(s1.compareTo(s2)<0){
                c2+=3;
            }else{
                c1++;c2++;
            }
        }
        ln(c1+" "+c2);
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
