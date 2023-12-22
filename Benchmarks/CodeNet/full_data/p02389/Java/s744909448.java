import java.util.*;
 
class text{
    Scanner sc = new Scanner(System.in);
 
    text(){
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println( (a*b) + " " + (a*2+b*2) );
    }
 
    public static void main(String[] args){
    new text();
    }
}
