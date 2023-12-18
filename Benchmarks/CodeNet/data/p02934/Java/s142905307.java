import java.util.*;

public class Main { //クラス名はMain
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      double m=0;
      //double c=1;
      for(int i=0;i<n;i++){
      		double a=sc.nextDouble();
        	m+=1.0/a;
        	//c*=a;
      }
      	System.out.println(1/m);
    }
}