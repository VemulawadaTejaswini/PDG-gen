import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int x1 = sc.nextInt();
int y1 = sc.nextInt();
int x2 = sc.nextInt();
int y2 = sc.nextInt();
int dx=x2-x1;
int dy=y2-y1;
    out.println((x2-dy)+" "+(y2+dx)+" "+(x1-dy)+" "+(y1+dx));
}}