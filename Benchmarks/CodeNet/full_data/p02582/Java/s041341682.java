import java.awt.desktop.SystemEventListener;
import java.util.*;
import java.lang.*;
import java.io.*;


public class main {
    public static void main(String[] args) {
        Scanner saj = new Scanner(System.in);
        String work = saj.next();
        int ann=0;
        for(int i=0;i<work.length();i++){
            if(work.charAt(i)=='R'){
                ann++;
            }
        }
        System.out.println(ann);

    }

}



