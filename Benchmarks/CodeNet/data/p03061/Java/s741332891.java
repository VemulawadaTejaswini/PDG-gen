import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long[] array = new long[num];
        for(int i=0; i<num; i++){
          array[i] = sc.nextInt(); 
        }
        int index = 0;
        int at = 0;
        long gcd = 0;
        long max = 0;
        boolean check = true;
        for(int i=0; i<num; i++){
        while(index < num){
          if(index+1 >= num) break;
          if(num==2){
            gcd = cal(array[index], array[index+1]);
            index+=2;
          }
          if(!check) gcd = cal(gcd, array[index]);
          else if(check && at==index) {
            gcd = cal(array[index+1], array[index+2]);
            index+=2;
            check = false;
          }
          else if(check && at==index+1) {
            gcd = cal(array[index], array[index+2]);
            index+=2;
            check = false;
          }
          else {
            gcd = cal(array[index], array[index+1]);
            index++;
            check = false;
          }
          index++;
          //System.out.print(gcd+"("+index+") ");
          if(gcd==1) break;
        }
        //System.out.println();
        if(max < gcd) max = gcd;
        //System.out.print(gcd+" ");
        at++;
        index = 0;
        check = true;
        }
		System.out.println(max);
	}
   public static long cal(long x, long y) {
        long x2 = x;
        long y2 = y;
        if(x2 < y2) return cal(y2, x2);
        if(y2 == 0) return x2;
        return cal(y2, x2 % y2);
      }
}