import java.util.*;
import java.util.ArrayList;
public class Main{
    public static void main(String[]args){  
    Scanner sc=new Scanner(System.in);
    long X=sc.nextLong();
    long Y=sc.nextLong();
    int sum=0;
    for(;X<=Y;){
        sum++;
        X=X*2;
    }
    System.out.println(sum);

    }
}