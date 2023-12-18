import java.io.*;
import java.util.*;
class Abc97a
{
public static void main (String args[])
{
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    String ans;

    if( b-a <= d && c-b <= d){
        ans = "Yes";
    }
    else{
        ans = "No";
    }
    if( d*(-1) < a-c && a-c < d){
        ans = "Yes";
    }
    else{
        ans = "No";
    }
    System.out.println(ans);

}
}