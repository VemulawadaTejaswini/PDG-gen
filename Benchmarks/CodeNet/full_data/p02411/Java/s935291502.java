import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m,f,r,scoa;
        
        while(true){
            m = sc.nextInt();
            f = sc.nextInt();
            r = sc.nextInt();
            if(m==-1&&f==-1&&r==-1)break;
            scoa = m+f;
            if(m==-1||f==-1)System.out.println("F");
            else if (scoa>=80)System.out.println("A");
            else if (scoa>=65&&scoa<80)System.out.println("B");
            else if (scoa>=50&&scoa<65)System.out.println("C");
            else if (scoa>=30&&scoa<50&&r>=50)System.out.println("C");
            else if (scoa>=30&&scoa<50&&r<50)System.out.println("D");
            else if (scoa<=30)System.out.println("F");
            else System.out.println("E");
        }
        sc.close();
    }
}
