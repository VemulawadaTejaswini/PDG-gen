import java.io.BufferedReader;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;

public class Main {
	public static void main(final String[] args){
    
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    List<Integer> list = new ArrayList<>();

    if(s.equals("SUN")){
        System.out.println(7);
    }else if(s.equals("MON")){
        System.out.println(6);
    }else if(s.equals("TUE")){
        System.out.println(5);
    }else if(s.equals("WED")){
        System.out.println(4);
    }else if(s.equals("THU")){
        System.out.println(3);
    }else if(s.equals("FRI")){
        System.out.println(2);
    }else{
        System.out.println(1);
    }
    
    



    





}
}