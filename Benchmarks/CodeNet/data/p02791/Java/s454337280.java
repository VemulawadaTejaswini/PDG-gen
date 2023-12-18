import java.util.*;
public class Main { 
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int o=0;
       int n=sc.nextInt();
      int mini=2000000;
      for(int i=0;i<n;i++){
      	int p=sc.nextInt();
        if(p<=mini){
        	o++;
            mini=p;
        }
      }
      System.out.println(o);
    }
}