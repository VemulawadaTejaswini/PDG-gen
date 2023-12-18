import java.util.*;
public class Main{
  
  public static int minVal(int n, int[] value, int index){
  	if(index >= value.length){
      return 0;
    }
    
    int temp1 = index;
    temp1++;
    int ans1 = 0;
    if(temp1 < value.length){
      ans1 = Math.abs(value[index]-value[temp1]) + minVal(n-1, value, index++);
    }
    int temp2 = index;
    temp2+=2;
    int ans2 = 0;
    if(temp2 < value.length){
      ans2 = Math.abs(value[index]-value[temp2]) + minVal(n-2, value, index+=2);
    }
    
    
    return Math.min(ans1, ans2);
  
  }
  
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int value[] = new int[n];
      for(int i=0; i<n; i++){
        value[i] = sc.nextInt();
      }
      int ans = minVal(n, value, 0);
      
    }


}