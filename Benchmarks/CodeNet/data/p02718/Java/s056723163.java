import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    double M = sc.nextDouble();

    int[]list = new int[N];
    int all=0;
    for(int i=0; i<N; i++){
	  list[i] = sc.nextInt();	
      all += list[i];
}  
    /*System.out.println(all);
    System.out.println(all/4/M);
	System.out.println(list[0]);*/

      int count =0;
      for(int j=0; j<N; j++){
        if(list[j] >= all/4/M){
         count++;
        }
      }
		if(count >= M){
      System.out.println("Yes");
        }else{
      System.out.println("No");
        }
}
}