import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s,f,r;
        int m;
        int h;
        while(true){
            s=sc.nextLine();
            if(s.equals("-"))break;
            m=Integer.parseInt(sc.nextLine());
            for(int i=0;i<m;i++){
                h=Integer.parseInt(sc.nextLine());
                f=s.substring(0, h);
                r=s.substring(h);
                s=r+f;
            }
            System.out.println(s);
        }
    }
}