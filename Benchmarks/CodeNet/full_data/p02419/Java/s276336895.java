import java.util.*;

public class Main{
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    String w = sc.next().toLowerCase();
    

    int cnt=0;

    while(true){
        String T = sc.next();
        if(T.equals("END_OF_TEXT"))    break;
        String t = T.toLowerCase();
        if(t.equals(w))    cnt++;
        
    }

    System.out.println(cnt);
    sc.close();
    }
}
