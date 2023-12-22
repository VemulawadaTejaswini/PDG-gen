import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
        int f=scan.nextInt();
        int r=scan.nextInt();
        
        while(!(m==-1&&f==-1&&r==-1)){
            
            if(m==-1||f==-1)
                System.out.println("F");
            else if(80<=m+f)
                System.out.println("A");
            else if(65<=m+f)
                System.out.println("B");
            else if(50<=m+f)
                System.out.println("C");
            else if(30<=m+f&&50<=r)
                System.out.println("C");
            else if(30<=m+f)
                System.out.println("D");
            else
                System.out.println("F");
            
            m=scan.nextInt();
            f=scan.nextInt();
            r=scan.nextInt();
        }
    }
}
