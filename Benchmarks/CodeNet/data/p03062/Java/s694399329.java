import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        long[] b = new long[a];
        long sum = 0;
        long max = 0;
        long case1 = 0;
        long case2 = 0;
        long case3 = 0;
        long case4 = 0;
        long case5 = 0;
		for(int i=0; i<a; i++){
          b[i] = sc.nextLong();
        }
        for(int i=0; i<a-2; i++){
          case1 = b[i] + b[i+1] + b[i+2];
          case2 = -b[i] + (-b[i+1]) + b[i+2];
          case3 = b[i] + (-b[i+1]) + (-b[i+2]);
          case4 = -b[i] + b[i+1] + (-b[i+2]);
          case5 = b[i] + b[i+1] + (-b[i+2]);
          max = Math.max(case1, case2);
          max = Math.max(max, case3);
          max = Math.max(max, case4);
          max = Math.max(max, case5);
		  if(max == case1 || max == case5){
          }
          /*else if(max == case5){
            if(i+2 < a-1) b[i+2] = -b[i+2];
            if(i+3 < a) b[i+3] = -b[i+3];
            System.out.print("[case5]:");
          }*/
          else if(max == case2){
            b[i] = -b[i];
            b[i+1] = -b[i+1];
            //System.out.print("[case2]:");
          }
          else if(max == case3){
            b[i+1] = -b[i+1];
            b[i+2] = -b[i+2];
            //System.out.print("[case3]:");
          }
          else if(max == case4){
            b[i] = -b[i];
            b[i+2] = -b[i+2];
            //System.out.print("[case4]:");
          }

          //System.out.print(max+" ");
        }
        //System.out.println();
        for(int i=0; i<a; i++){
          sum += b[i]; 
          //System.out.print(b[i]+" ");
        }
      
		System.out.println(sum);
	}
}