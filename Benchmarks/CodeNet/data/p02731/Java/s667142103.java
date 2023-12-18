import java.util.*;

public class Main{
public static void main(String[]args){
    int a = 0;
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    float max =0;
    max=a/3;
    
    float count =0;
    count = max*max*max;

    System.out.println(count);
}

}