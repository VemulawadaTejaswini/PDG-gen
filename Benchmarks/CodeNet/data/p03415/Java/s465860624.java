import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] c;
        c = new String[3];
        for(int i=0;i<c.length;i++)
        {
            c[i]=scan.next();
            System.out.print(c[i].charAt(i)); 
        }
        System.out.println("");
    }
}