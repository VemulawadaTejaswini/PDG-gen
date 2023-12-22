import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String wstrg = sc.next();
        int count = 0;
        if(wstrg == "SSS") count = 0;
        if(wstrg == "SSR") count = 1;
        if(wstrg == "SRS") count = 1;
        if(wstrg == "RSS") count = 1;
        if(wstrg == "RRS") count = 2;
        if(wstrg == "SRR") count = 2;
        if(wstrg == "RSR") count = 1;
        if(wstrg == "RRR") count = 3;
        System.out.println(count);
    }
}