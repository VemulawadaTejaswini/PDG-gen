import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int t = sc.nextInt();
        int ans = 0;
		int [] a = new int [n];
        int [] b = new int [n];
        int [] c = new int [n];
        for(int i=0;i<n;i++){a[i] = sc.nextInt();
                             b[i] = sc.nextInt();
                            }
	    int time = 0;
        int vis = 0;
        int min = t;
        while(time<=t && ans<=n){time++; vis = 0; min = t;
                      for(int i=0;i<n;i++){c[i] = b[i]+a[i]*time; 
                                           if(min>=c[i]){min = c[i];}}
                      for(int i=0;i<n;i++){                           
          if(vis == 0 && time+c[i]<=t && c[i] == min)  {ans++;
                                                        vis++;
                                                        time+=c[i];
                                                        b[i]=t;                                                                    
                      }
                      }
                                                      } 
		System.out.println(ans);
	}
}