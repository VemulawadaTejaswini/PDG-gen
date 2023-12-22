import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int x =sc.nextInt();
        int y =sc.nextInt();
        int z =sc.nextInt();
        if(x<y && y<z){
        System.out.print(x);
        System.out.print(" ");
        System.out.print(y);
        System.out.print(" ");
        System.out.println(z);
        }else if(y<x && x<z){
        System.out.print(y);
        System.out.print(" ");
        System.out.print(x);
        System.out.print(" ");
        System.out.println(z);
        }else if(z<y && y<x){
         System.out.print(z);
        System.out.print(" ");
        System.out.print(y);
        System.out.print(" ");
        System.out.println(x);
        }else if(x<z && z<y){
        System.out.print(x);
        System.out.print(" ");
        System.out.print(z);
        System.out.print(" ");
        System.out.println(y);
        }else if(y<z && z<x){
        System.out.print(y);
        System.out.print(" ");
        System.out.print(z);
        System.out.print(" ");
        System.out.println(x);
        }else if(z<x && x<y){
        System.out.print(z);
        System.out.print(" ");
        System.out.print(x);
        System.out.print(" ");
        System.out.println(y);
        }else if(x==y && y<z){
        System.out.print(x);
        System.out.print(" ");
        System.out.print(y);
        System.out.print(" ");
        System.out.println(z);    
        }else if(x==y && y>z){
        System.out.print(y);
        System.out.print(" ");
        System.out.print(x);
        System.out.print(" ");
        System.out.println(z); 
        }else if(x==z && x>y){
         System.out.print(z);
        System.out.print(" ");
        System.out.print(y);
        System.out.print(" ");
        System.out.println(x);
        }else if(x==z && x<y){
         System.out.print(x);
        System.out.print(" ");
        System.out.print(z);
        System.out.print(" ");
        System.out.println(y); 
        }else if(y==z && x<y){
         System.out.print(x);
        System.out.print(" ");
        System.out.print(y);
        System.out.print(" ");
        System.out.println(z); 
        }else if(y==z && x>y){
         System.out.print(y);
        System.out.print(" ");
        System.out.print(z);
        System.out.print(" ");
        System.out.println(x); 
        }else if(x==z && x>y){
         System.out.print(y);
        System.out.print(" ");
        System.out.print(z);
        System.out.print(" ");
        System.out.println(x); 
        }else if(x==z && x<y){
         System.out.print(x);
        System.out.print(" ");
        System.out.print(z);
        System.out.print(" ");
        System.out.println(y); 
            }
    }
}
    

