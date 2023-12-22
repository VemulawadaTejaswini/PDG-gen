import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String wstrg = sc.next();
        int count = 0;
        if(wstrg.equals("SSS")) count = 0;
        if(wstrg.equals("SSR")) count = 1;
        if(wstrg.equals("SRS")) count = 1;
        if(wstrg.equals("RSS")) count = 1;
        if(wstrg.equals("RRS")) count = 2;
        if(wstrg.equals("SRR")) count = 2;
        if(wstrg.equals("RSR")) count = 1;
        if(wstrg.equals("RRR")) count = 3;
        System.out.println(count);
    }
}