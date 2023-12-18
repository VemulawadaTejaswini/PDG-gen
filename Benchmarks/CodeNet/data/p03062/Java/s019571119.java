import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        long[] b = new long[a];
        long[] c = new long[a];
        long[] d = new long[a];
        long sum = 0;
        long sum2 = 0;
        boolean check = false;
		for(int i=0; i<a; i++){
          b[i] = sc.nextLong();
          c[i] = b[i];
          d[i] = b[i];
        }
        for(int i=a-1; i>0; i--){
          if(check){
            if(b[i] + b[i-1] < -(b[i] + b[i-1])){
              b[i] = -b[i];
              b[i-1] = -b[i-1];
            }
            else if(c[i] + b[i-1] < -(c[i] + b[i-1])){
              b[i+1] = -c[i+1];
              b[i] = -c[i];
              b[i-1] = -b[i-1];
            }
          }
          if(!check && b[i] + b[i-1] < -(b[i] + b[i-1])){
            b[i] = -b[i];
            b[i-1] = -b[i-1];
            check = false;
          }
          else if(b[i] + b[i-1] == -(b[i] + b[i-1])){
            c[i] = -c[i];
            c[i-1] = -c[i-1];
            check = true;
          }
          else check = false;
        }
        for(int i=0; i<a; i++){
          sum += b[i]; 
        }
      
        check = false;
        for(int i=0; i<a-1; i++){
          if(check){
            if(d[i] + d[i+1] < -(d[i] + d[i+1])){
              d[i] = -d[i];
              d[i+1] = -d[i+1];
            }
            else if(c[i] + d[i+1] < -(c[i] + d[i+1])){
              d[i-1] = -c[i-1];
              d[i] = -c[i];
              d[i+1] = -d[i+1];
            }
          }
          if(!check && d[i] + d[i+1] < -(d[i] + d[i+1])){
            d[i] = -d[i];
            d[i+1] = -d[i+1];
            check = false;
          }
          else if(d[i] + d[i+1] == -(d[i] + d[i+1])){
            c[i] = -c[i];
            c[i+1] = -c[i+1];
            check = true;
          }
          else check = false;
        }
        for(int i=0; i<a; i++){
          sum2 += d[i]; 
        }
		System.out.println(sum > sum2 ? sum : sum2);
	}
}