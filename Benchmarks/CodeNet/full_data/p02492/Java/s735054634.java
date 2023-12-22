import java.util.*;

class Main {
    void run(){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        String op;
        while(true){
            a = sc.nextInt();
            op = sc.next();
            b = sc.nextInt();
            if(op.equals("?")){
                break;
            }else if(op.equals("+")){
                c = a+b;
            }else if(op.equals("-")){
                c = a-b;
            }else if(op.equals("*")){
                c = a*b;
            }else if(op.equals("/")){
                c = a/b;
            }
        }
        
        
    }
    
    public static void main(String[] args){
        new Main.run();
    }
}