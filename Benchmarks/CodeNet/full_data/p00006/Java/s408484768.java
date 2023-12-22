import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class Main{
    public static void main(String[] a) throws Exception{
    	ArrayList<String> lst = new ArrayList<String>();
    	
    	Scanner scan = new Scanner(System.in);
    	
    	StringBuffer a1 = new StringBuffer(scan.next());
        System.out.println(a1.reverse());
    }
}