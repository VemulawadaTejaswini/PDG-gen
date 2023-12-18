import java.io.BufferedReader;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
public class Main {
	public static void main(final String[] args){
    
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int a = x / 500;
    int b = x - (a * 500);
    int score = a * 1000;
    int c = b / 5;
    score += c*5;
    System.out.println(score);

   
    
    
    
	}
}