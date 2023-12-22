import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();
    
    int sunu[] = new int[N];
    for(int i=0;i<K;i++){
      int d =  sc.nextInt();
      // System.out.println(i+"iii"); 
      for(int j=0; j<d; j++){
        // System.out.println(j+"ssd");  
        sunu[sc.nextInt()-1]++;
        // System.out.println(j+"aaa"); 
      }
    }
    int count = 0;
    for(int i=0;i<N;i++){
      if(sunu[i]==0){
        count++;
      }
    }
    System.out.println(count);  
  }
}



