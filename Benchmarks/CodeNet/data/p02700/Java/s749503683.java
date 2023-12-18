import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h1=s.nextInt(),s1=s.nextInt(),h2=s.nextInt(),s2=s.nextInt();
        while(h1>0&&h2>0){
            h2-=s1;
            if(h2<=0){
                System.out.println("Yes");
                break;
            }
            h1-=s2;
               
        }
        if(h1<=0){
            System.out.println("No");
        }
        
    }
}
