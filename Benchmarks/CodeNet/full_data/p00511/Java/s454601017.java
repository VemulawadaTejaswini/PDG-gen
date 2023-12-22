import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(true){
            String b = sc.next();
            if(b.equals("=")){
                break;
            }
            int c = sc.nextInt();
            if(b.equals("+")){
                a += c;
            }else if(b.equals("-")){
                a -= c;
            }else if(b.equals("*")){
                a *= c;
            }else if(b.equals("/")){
                a /= c;
            }
        }   
        System.out.println(a);
        sc.close();
    }
}
