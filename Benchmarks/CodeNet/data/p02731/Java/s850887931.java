import java.util.*;

public class Main{
public static void main(String[]args){
    int a = 0;
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    
    
    double count=0;
    count = a/3;
    double acount=0;
    acount = count*count*count;
    System.out.println(acount);
}

}