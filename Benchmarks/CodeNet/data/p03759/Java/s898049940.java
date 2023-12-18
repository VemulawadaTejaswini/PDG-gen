import java.util.*;
import java.util.ArrayList;
public class Main{
    public static void main(String[]args){  
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int d=b-a;
    int e=c-b;
    if(d==e){
        System.out.println("YES");
    }else{
        System.out.println("NO");
    }
    
    }
}