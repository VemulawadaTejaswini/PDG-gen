import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
	int[] d = new int[n];
    d[0] = sc.nextInt();
    if(d[0]!=0){
      System.out.println(0);
    }
    else{
      for(int i=1; i<n; i++){
        d[i] = sc.nextInt();
    	}
      Arrays.sort(d);
      System.out.println(Check(d));
  	}
  }
  
  public static int Check(int[] d){
    int ans = 1;
    int cnt = 1;
    for(int i=0; i<d.length-1; i++){
      if(d[i]==d[i+1] && d[i+1]!=0){
        cnt++;
      }
      else if(d[i]==d[i+1]-1 && d[i+1] != 0){
        ans = ans*Factorial(cnt)*Factorial(ans);
        cnt = 1;
      }
      else{
        ans = 0;
        break;
      }
    }
    return ans%998244353;
  }
  
  public static int Factorial(int x){
    if(x == 1){
      return 1;
    }
    else if(x<1){
      return 0;
    }
    else{
      return x * Factorial(x-1);
    } 
  }
}
     