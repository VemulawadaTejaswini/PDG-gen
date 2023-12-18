import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),f=0;
    String[] s=sc.next().split("");
    for(int i=0;i<n-2;i++){
      for(int j=i+1;j<n-1;j++){
        if(s[i].equals(s[j])){
          continue;
        }else{
          for(int k=j+1;k<n;k++){
            if(s[i].equals(s[j])==false&&s[j].equals(s[k])==false){
              if((j-i)!=(k-j)){
                f++;
              }else{continue;}
            }else{continue;}
          }
        }
      }
    }
    System.out.print(f);
  }
}