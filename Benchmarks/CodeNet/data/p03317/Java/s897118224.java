import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int a[] = new int[n];
    int leftc = 0;
    int rightc =0;
    int answer =0;
    for(int i=0;i<n;i++){
      a[i] = sc.nextInt();
      if(a[i]==1){
        leftc=i;
        rightc = n -i-1;
      } 
    }
    if(leftc%(k-1)==0){
      answer = (leftc/(k-1));
    }else{
      answer = (leftc/(k-1))+1;
      rightc = rightc-((k-1)-(leftc%(k-1)));
    }
    if(rightc<0){
      answer = answer;
    }else{
    answer =answer +( rightc%(k-1)==0?(rightc/(k-1)):(rightc/(k-1))+1);
    }
      System.out.println(answer);
    
    
    
    
  }
  

  
}