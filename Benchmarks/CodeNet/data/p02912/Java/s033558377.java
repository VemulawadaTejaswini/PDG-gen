import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
      	int M = sc.nextInt();
      	
      	ArrayList<Integer> list = new ArrayList<Integer>();
      
      	for(int i=0;i<N;i++){
      	int n = sc.nextInt();
          list.add(n);
        }
      	
      	
      
      	for(int i=0;i<M;i++){
          int Max =0;
          for(int j=0;j<N;j++){
        Max = Math.max(Max,list.get(j));
          }
         
            int c = list.indexOf(Max);
              int d = (int)((long)Max/2);
          list.set(c,d);
        }
      
      long ans = 0;
     for(int i=0;i<N;i++){
      	int score = list.get(i);
          ans += score;
        }
         
          System.out.println(ans);
    
      
	}
}