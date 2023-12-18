import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int k = sc.nextInt();
    int l = b-a+1;
    //int s[] = new int[l];
    int num = a;
    int num2 = b-k;
    
    /*for(int i = 0 ; i < l ; ++i){
      
      s[i] = num;
      num++;
    }*/
    
    if(l/2 <= k){
      for(int i = 0 ; i < l ; ++i){
        
        System.out.println(num);
        num++;
      }
      
    }else if(l/2 > k){
      for(int i = 0 ; i < k ; ++i){
        System.out.println(num);
        num++;
      }
      for(int i = l-k ; i < l ; ++i){
        num2++;
        System.out.println(num2);
      }
    }    
  }
}