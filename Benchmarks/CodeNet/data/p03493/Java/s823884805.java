import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    System.out.println(a);
    int o = 0 ;
    for(int i=0; i <3; i++ ){
        if(a.substring(i) == "1"){
            o++;
        } ;
    }
        System.out.println(o);
    }    
}
