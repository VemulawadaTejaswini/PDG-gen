import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<>();
    
    for(int i = 0; i < n; i++)
      list.add(sc.nextInt());
    Collections.sort(list);
    
    int count = 0;
    int a,b,c;
    a: for(int ai = 0; ai < n-2; ai++){
      b: for(int bi = ai+1; bi < n-1; bi++){
        c: for(int ci = bi+1; ci < n; ci++){
    		a = list.get(ai);
     		b = list.get(bi);
      		c = list.get(ci);
    		if(a >= (b+c))
				break a;
          	if(b >= (c+a))
              continue a;
          	if(c >= (a+b)) 
              continue b;
          
          	count++; 	
        }
      }
    }
    System.out.println(count);
  }
}