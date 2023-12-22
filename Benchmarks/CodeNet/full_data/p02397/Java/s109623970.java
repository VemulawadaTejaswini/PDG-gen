import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        while(true){
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        int p;
        
        if(a==0&&b==0) break;
        
        
        if(b<a){
        p=b;
        b=a;
        a=p;
        }
        
        System.out.println(a+" "+b);
        }
        
    }
    
}
