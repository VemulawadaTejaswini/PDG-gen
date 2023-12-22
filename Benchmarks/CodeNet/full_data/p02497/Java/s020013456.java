import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m=0;
        int f=0;
        int r=0;
        
        while(true){
            m=sc.nextInt();
            f=sc.nextInt();
            r=sc.nextInt();
            if((m==-1)&&(f==-1)&&(r==-1))break;
            
            if((m==-1)||(f==-1)){
                System.out.println("F");
                continue;
            }
            
            int a = m+f;
            
            if(a>=80){
                System.out.println("A");
            }else if(a>=65){
                System.out.println("B");
            }else if(a>=50){
                System.out.println("C");
            }else if(a>=30){
                if(r>=50){
                    System.out.println("C");
                }else{
                    System.out.println("D");
                }
            }else{
                System.out.println("F");
            }
        }
    }
}