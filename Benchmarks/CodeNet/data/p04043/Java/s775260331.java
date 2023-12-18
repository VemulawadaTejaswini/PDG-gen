import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] list={sc.next(), sc.next(), sc.next()};
        int five_count=0;
        int seven_count=0;
        for(String l:list){
            if(l.equals("5"))
                five_count++;
            else if(l.equals("7"))
                seven_count++;
        }
        if(five_count==2 && seven_count==1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}