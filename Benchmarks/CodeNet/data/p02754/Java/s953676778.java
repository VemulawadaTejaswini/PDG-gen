import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
       int n = sc.nextInt();
       int a = sc.nextInt();
       int b = sc.nextInt();
       
       
                int block = n/(a+b);
                int amari = n%(a+b);
                int total = a*block;
                if(amari<=a){
                    total+=amari;
                }else if(a<amari){
                    total+=a;
                }
                System.out.println(total);
            
    }
}