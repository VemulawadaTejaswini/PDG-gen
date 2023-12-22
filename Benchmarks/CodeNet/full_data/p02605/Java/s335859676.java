import java.util.*;
public class Main {
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long[] x = new long[n];
      long[] y = new long[n];
      String[] u = new String[n];
      for(int i=0;i<n;i++){
        x[i] = sc.nextLong();
        y[i] = sc.nextLong();
        u[i] = sc.next();
        //System.out.println(x[i]+","+y[i]+","+u[i]);
      }
      long time = 100000000;
      long time2= 100000000;
      for(int i=0;i<n;i++){
        if( u[i].equals("U") ){
          for(int j=0;j<n;j++){
            if( u[j].equals("R") && y[j] - y[i] == x[i] - x[j] && y[j] - y[i] > 0 && y[j] - y[i] < time ){
                  time = y[j] - y[i];
            }else if( u[j].equals("D") && x[i] == x[j] && y[j] - y[i] < time2 && y[j] - y[i] > 0 ){
                time2 = y[j] - y[i];
            }else if( u[j].equals("L") && y[j] - y[i] == x[j] - x[i] && y[j] - y[i] > 0 && y[j] - y[i] < time  ){
                  time = y[j] - y[i];
            }
          }
        }else if( u[i].equals("R") ){
          for(int j=0;j<n;j++){
            if( u[j].equals("D") && x[j] - x[i] == y[j] - y[i] && x[j] - x[i] > 0 && x[j] - x[i] < time ){
                  time = x[j] - x[i];
            }else if( u[j].equals("L") &&  y[i] == y[j] && x[j] - x[i] < time2 && x[j] - x[i] > 0 ){
              time2 = x[j] - x[i];
            }
          }
        }else if( u[i].equals("D") ){
          for(int j=0;j<n;j++){
            if( u[j].equals("L") && y[i] - y[j] == x[j] - x[i] && y[i] - y[j] > 0 && y[i] - y[j] < time ){
                  time = y[i] - y[j];
            }
          }
        }
      }     
      if( time == 100000000 && time2 == 100000000 ){
        System.out.println("SAFE");
      }else if( time * 2 > time2 ){
        System.out.println(time2*5);
      }else{
        System.out.println(time*10);
      }
    }
}