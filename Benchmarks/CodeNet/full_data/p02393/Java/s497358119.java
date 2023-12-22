import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if(a <= b && a <= c){
            if(b <= c){
                System.out.println(a + " " + b + " " + c);
            }else if(b >= c){
                System.out.println(a + " " + c + " " + b);
            }
        }else if(b <= a && b <= c){
            if(a <= c){
                System.out.println(b + " " + a + " " + c);
            }else if(a >= c){
                System.out.println(b + " " + c + " " + a);
            }
        }else if(a >= c && b >= c){
            if(a >= b){
                System.out.println(c + " " + b + " " + a);
            }else if(a <= b){
                System.out.println(c + " " + a + " " + b);
            }
        }
    }
}
