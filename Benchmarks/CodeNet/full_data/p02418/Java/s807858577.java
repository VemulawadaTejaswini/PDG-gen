package sample;

//import java.util.Scanner;
//import java.io.*;

 class Main {
    public static void main(String[] args){ 
    	InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
    	   	                                                 
    	String s = reader.readerLine();
        String p = reader.readerLine();        
        2s = s + p;

        if(2s.indexOf(p) != -1){
        System.out.println("Yes")
        }      
        else{
        System.out.println("No");
        }
    }
}