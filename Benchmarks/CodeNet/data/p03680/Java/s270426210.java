import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
      	int lamp[] = new int[n+1];
      
      lamp[0] = -1;
      for(int i = 1;i < n+1;i++){
      lamp[i] = in.nextInt();
      }
      
      int now = lamp[1];int co = 0;
      for(int i = 0;i<n;i++){
        if(now==2){
          	co++;
        	break;
        }else{
        now = lamp[now];
        co++;
        }
      }
      if(co>n-1){System.out.print(-1);}
      else{System.out.print(co);}
      
	}
}
