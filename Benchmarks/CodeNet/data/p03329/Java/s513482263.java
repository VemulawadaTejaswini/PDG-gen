import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int target = sc.nextInt();
    int answer = 99999999;
    
    for(int i = 0;i<target;i++){
      int ans=0;
      int temp = i;
      while((temp = check(temp,6)) >= 0){
        ans++;
      }
      temp = target - i;
      while((temp = check(temp,9)) >= 0){
        ans++;
      }
      if(ans<answer)answer = ans;
    }
    System.out.println(answer);
  }
  
  public static int check(int target,int base){
    if(target < 6) {
      return target-1;
    }else{
      return target - limit(target,base);
    }
  }
  
  public static int limit(int target,int base){
    int n = 0;
    while(repow(base,n) <= target){
      n++;
    }
    return repow(base,n-1);
  }
  
  public static int repow(int a,int b){
    return (int) Math.pow((double)a,(double)b);
  }
}