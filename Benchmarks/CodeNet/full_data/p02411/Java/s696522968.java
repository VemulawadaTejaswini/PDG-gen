import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    for(int i=0; ;i++){
        int m=sc.nextInt();
        int f=sc.nextInt();
            int r=sc.nextInt();
        if(m==-1&&f==-1&&r==-1) break;
           else if(m==-1 || f==-1){
            System.out.println("F");
        }else  if(r==-1){
        if(m+f>=80) System.out.println("A");
        if(m+f<80&&m+f>=65) System.out.println("B");
                if(m+f<65&&m+f>=50) System.out.println("C");
                if(m+f<50&&m+f>=30) System.out.println("D");
                if(m+f<30) System.out.println("F");
        }else if(m+f<50&&m+f>=30&&r>=50) System.out.println("C");
    }
    }
}
       

