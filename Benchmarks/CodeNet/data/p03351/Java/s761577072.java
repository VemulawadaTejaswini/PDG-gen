import java.io.*;
import java.util.*;
class Main
{
public static void main (String args[])
{
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    String ans;

    if( d*(-1) <= a-c && a-c <= d){ // aとcの差がd以内
        ans = "Yes";
    }
    else if( d*(-1) <= a-b && d*(-1) <= c-b && d >= a-b && d>= c-b){
        ans = "Yes";
    }
    else{
        ans = "No";
    }
    System.out.println(ans);

}
}