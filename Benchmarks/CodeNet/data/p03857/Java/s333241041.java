import java.util.*;

class Main{
  static Scanner sc = new Scanner(System.in);
  public static void main(String args[]){
    int city = sc.nextInt();
    int load = sc.nextInt();
    int train = sc.nextInt();
    
    int[][] table = new int[city][city];
    
    count(table,load,0);
    count(table,train,1);
    
    for(int i = 0;i<city;i++){
      int ans = 1;
      if(i!=0)System.out.print(" ");
      for(int j = 0;j<city;j++){
        if(table[i][j] == 2) ans++;
      }
      System.out.print(ans);
    }
    System.out.println();
  }
  
  public static void count(int[][] table,int a,int b){
    for(int i = 0;i<a;i++){
      int left= sc.nextInt()-1;
      int right = sc.nextInt()-1;
      if(table[left][right]==b){
        table[left][right]++;
        table[right][left]++;
      }
      for(int j = 0;j<table[i].length;j++){
        
          if(table[left][j] == b+1&&j!=right){
            if(table[j][right] == b){
              table[j][right]++;
              table[right][j]++;
            }
          }
        
      }
      
    }
  }
}