import java.util.*;
public class Main{
  public static void main(String args[]){


try (Scanner sc = new Scanner(System.in)) {
  while(true){
  int n = sc.nextInt();
  int r = sc.nextInt();
  int count = 0;
  if(n==0 && r==0){
    break;
  }
  int[] data = new int[n];
  int[] tmp = new int[n];
  for(int i = 0;i<n;i++){//スタートの並び
    data[i] = n - i;
  }

  while(count != r){
    int z = 0;
    int a = sc.nextInt();
    int b = sc.nextInt();
    while(z<b){
      tmp[z] = data[a-1+z];
      z++;
    }
    int y = 0;
    
    while(y<a-1){
      tmp[z] = data[y];
      y++;
      z++;
    }

    
    
    while(z<n){
      tmp[z] = data[z];
      z++;
    }
  
    
    for(int i = 0;i<n;i++){
      data[i] = tmp[i];
    }
    count++;
  }
  System.out.println(data[0]);
}

}
  }
}
