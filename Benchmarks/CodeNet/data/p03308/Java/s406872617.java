import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int[] a = new int[num];
    int max = 0;
    
   
    
    fot(int i = 0;i < num;i++){
     a[i] = sc.nextInt();
     if(max < a[i])
       max = a[i];
    }
    int min = a[0];
    for(int i = 0;i < num;i++){
     if(min > a[i])
       min = a[i];
    }
    int ans = max - min;
    
    System.out.println(ans);
  }
}
