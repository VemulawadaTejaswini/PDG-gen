import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int s=sc.nextInt();
      int x,y,z,w;

        z=s%10;

        if(10<=s){
          y=(s-z)%100/10;
        }
        else{
          y=0;
        }

        if(100<=s){
          x=(s-10*y-z)%1000/100;
        }
        else{
          x=0;
        }

        if(1000<=s){
          w=(s-100*x-10*y-z)%10000/1000;
        }
        else{
          w=0;
        }
///////////////////////////////////////////////////////////
        if(x==y || y==z || z==w){
          System.out.println("Bad");
        }
        else{
          System.out.println("Good");
        }
///////////////////////////////////////////////////////////



    }
}
