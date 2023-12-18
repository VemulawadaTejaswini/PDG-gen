import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
       long n = sc.nextInt();
       long a = sc.nextInt();
       long b = sc.nextInt();
       
       
                long block = n/(a+b);
                long amari = n%(a+b);
                long total = a*block;
                if(amari<=a){
                    total+=amari;
                }else if(a<amari){
                    total+=a;
                }
                System.out.println(total);
            
    }
}