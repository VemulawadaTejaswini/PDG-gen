import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt();
    int count2 = 0;
    int min =0;
    for(int i=0; i < count; i++ ){
        int a = sc.nextInt();
        while(a%2 == 0){
            a = a/2;
            count2++;
        }
        if(min <= count2){
        min = count2;
        count2 = 0 ;
        }
    }
        System.out.println(min);
    }    
}
