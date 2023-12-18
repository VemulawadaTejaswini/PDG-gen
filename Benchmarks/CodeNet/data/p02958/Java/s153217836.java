import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int li[] = new int[N];
    int count = 0;
    
    for(int i=0;i<N;i++){
      li[i] = sc.nextInt();
      if(li[i]!=i+1){
        count++;
      }
    }
    
    if(count==0 || count==2){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
} 