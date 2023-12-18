import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextInt();
      	long M = sc.nextInt();
      	
      	ArrayList<Long> list = new ArrayList<Long>();
      
      	for(int i=0;i<N;i++){
      	long n = sc.nextInt();
          list.add(n);
        }
      	
      	
      
      	for(int i=0;i<M;i++){
          long Max =0;
          for(int j=0;j<N;j++){
        Max = Math.max(Max,list.get(j));
          }
         
            int c = list.indexOf(Max);
              long d = (long)(Max/2);
          list.set(c,d);
        }
      
      long ans = 0;
     for(int i=0;i<N;i++){
      	long score = list.get(i);
          ans += score;
        }
         
          System.out.println(ans);
    
      
	}
}