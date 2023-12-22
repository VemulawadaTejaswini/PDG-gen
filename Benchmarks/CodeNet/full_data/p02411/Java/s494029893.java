import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,f,r,s;
        String g;
        while(true){
            m=sc.nextInt();
            f=sc.nextInt();
            r=sc.nextInt();
            if(m==-1&&f==-1&&r==-1){
                break;
            }
            s=m+f;
            if(m==-1 || f==-1 || s<30){
                g="F";
            }else if(s>=80){
                g="A";
            }else if(s>=65){
                g="B";
            }else if(s>=50 || r>=50){
                g="C";
            }else{
                g="D";
            }
            System.out.println(g);
        }
        sc.close();
    }
}
