import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m,f,r;
        while(true){
            m=sc.nextInt();
            f=sc.nextInt();
            r=sc.nextInt();
            if(m==-1&&f==-1&&r==-1) break;
            if(m==-1||f==-1){
                System.out.println("F");
            }
            int s=m+f;
            if(s>=80){
                System.out.println("A");
            }else if(65<=s&&s<80){
                System.out.println("B");
            }else if((50<=s&&s<65)||r>=50){
                System.out.println("C");
            }else if((30<=s&&s<50)&&(m!=-1&&f!=-1)){
                System.out.println("D");
            }else if(((0<s&&s<30)||(r>-1&&r<50))&&(m!=-1||f!=-1)){
                System.out.println("F");
            }
        }
    }
}
