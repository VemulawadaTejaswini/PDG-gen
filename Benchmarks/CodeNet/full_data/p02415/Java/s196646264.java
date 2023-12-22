import java.util.Scanner;
 
class Main {
    Scanner sc = new Scanner(System.in);
 
    public void run() {
        String str=sc.nextLine();
         
        char[] c=str.toCharArray();
        for(int i=0;i<c.length;i++){
            if('a'<=c[i] &&c[i]<='z'){
                c[i]=(char)(c[i]-'a'+'A');
            }else if('A'<=c[i] &&c[i]<='Z'){
                c[i]=(char)(c[i]-'A'+'a');
            }
        }
        ln(String.copyValueOf(c));
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
