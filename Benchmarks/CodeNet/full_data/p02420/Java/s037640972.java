import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s;
        int i,c = 0,m;

        while(true){
            s = sc.next();

            if(s.charAt(0)=='-')break;

            m = sc.nextInt();

            for(i = 0;i < m;i++){
                c = c + sc.nextInt();
            }

            for(i = 0;i < s.length();i++){
                System.out.print(s.charAt((c+i)%s.length()));
            }

            System.out.println();

            c = 0;
       }
    }   
}

