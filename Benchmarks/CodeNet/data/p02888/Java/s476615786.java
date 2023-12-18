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
    System.out.println(list.get(1));
    for(int ai = 0; ai < n-2; ai++){
      for(int bi = ai+1; bi < n-1; bi++){
        for(int ci = bi+1; ci < n; ci++){
    		a = list.get(ai);
     		b = list.get(bi);
      		c = list.get(ci);
    		if(a < (b+c) && b < (c+a) && c < (a+b)) count++;
        }
      }
    }
    System.out.println(count);
  }
}