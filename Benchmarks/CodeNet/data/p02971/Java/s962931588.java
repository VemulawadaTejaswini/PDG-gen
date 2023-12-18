import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
      int N = scanner.nextInt();
       
      ArrayList <Integer> a = new ArrayList <Integer>();
 int n[] = new int[N];
      for(int i=0; i<N; i++){
         n[i] =scanner.nextInt();
      	 a.add(n[i]);
      }
  
      
  
  	  for(int i=0; i<N; i++){
         Collections.sort(a);
         int max = a.get(a.size()-1);
         int max2 = a.get(a.size()-2);
        if(max==n[i]){
        System.out.println(max2);
        }
        else{
        System.out.println(max);
        }
      }
}
}