import java.util.*;
public class Main{
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  int max=0;
      int[] map = new int[n];
      for(int i = 0;i<n;i++)map[i]=sc.nextInt(); //入力
      int i;
      for(int j = 0;j<n;j++){
	      for(i=j;i<n-1;i++)if(map[i]<map[i+1])break;
          if(max<i-j)max=i-j;
	      j=i;
	      
      }
	  System.out.println(max);
    }
}