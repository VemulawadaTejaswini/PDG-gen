import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int a[] = new int[3];
    int b[] = new int[3];
    int c[] = new int[3];
    
    for(int i = 0; i < 3; i++){
      a[i] = sc.nextInt();
    }
    
    for(int i = 0; i < 3; i++){
      b[i] = sc.nextInt();
    }
    
    for(int i = 0; i < 3; i++){
      c[i] = sc.nextInt();
    }
    
    int n = sc.nextInt();
    
    int d[] = new int[n];
    
    for(int i = 0; i < n; i++){
      d[i] = sc.nextInt();
    }
    
    int count = 0;
    
    for(int i = 0; i < 3; i++){
      for(int j = 0; j < n; j++){
        if((a[i] == d[j]) && (b[i] == d[j]) && (c[i] == d[j])){
          count++;
        }
      }
    }
    
    for(int j = 0; j < n; j++){
      for(int i = 0; i < 3; i++){
        if(d[j] == a[i]){
          count++;
        }
      }
    }
    
    for(int j = 0; j < n; j++){
      for(int i = 0; i < 3; i++){
        if(d[j] == b[i]){
          count++;
        }
      }
    }
    
    for(int j = 0; j < n; j++){
      for(int i = 0; i < 3; i++){
        if(d[j] == c[i]){
          count++;
        }
      }
    }
    
    for(int j = 0; j < n; j++){
      if((d[j] == a[1]) && (d[j] == b[2]) && (d[j] == c[3])){
        count++;
      }
    }
    
    for(int j = 0; j < n; j++){
      if((d[j] == a[3]) && (d[j] == b[2]) && (d[j] == c[1])){
        count++;
      }
    }
    
    if(count == 0){
      System.out.println("No");
    }else{
      System.out.println("Yes");
    }
        
    sc.close();
     
  }
}
