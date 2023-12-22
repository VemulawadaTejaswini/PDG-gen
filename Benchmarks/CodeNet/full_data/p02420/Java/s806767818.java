import java.util.*;
public class Main {public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    int i,j,m,h;
    String f;
    for(i=0;i<10;i++){
        f=sc.next();
        if(f.equals("-"))break;
        m=sc.nextInt();
        for(j=0;j<m;j++){
            h=sc.nextInt();
            f=f.substring(h)+f.substring(0,h);
        }
        System.out.println(f);
        
    }
    }
}
