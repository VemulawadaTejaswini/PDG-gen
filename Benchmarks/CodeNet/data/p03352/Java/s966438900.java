mport java.util.*;

public class Main{
    public static void main(String[] args) {
         Scanner scn=new Scanner(System.in);
         int n=scn.nextInt();
         while(n!=0){
             double a=Math.sqrt((double)n);
             if(n%a==0){
                 System.out.println(n);
                 break;
             }else{n--;}
         }
    }
}
