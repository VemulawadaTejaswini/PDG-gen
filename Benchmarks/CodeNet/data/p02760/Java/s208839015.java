import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A[][] = new int[3][3];
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        A[i][j]=sc.nextInt();
      }
    }
    int N = sc.nextInt();
    int b[] = new int[N];
    for(int i=0;i<N;i++){
      b[i]=sc.nextInt();
    }
    int B[][] = new int[3][3];
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        B[i][j]=0;
      }
    }
    for(int i=0;i<N;i++){
      for(int j=0;j<3;j++){
        for(int k=0;k<3;k++){
          if(A[j][k]==b[i]){
            B[j][k]=1;
          }
        }
      }
    }
    if(B[0][0]+B[0][1]+B[0][2]==3||
       B[1][0]+B[1][1]+B[1][2]==3||
       B[2][0]+B[2][1]+B[2][2]==3||
       B[0][0]+B[1][0]+B[2][0]==3||
       B[0][1]+B[1][1]+B[2][1]==3||
       B[0][2]+B[1][2]+B[2][2]==3||
       B[0][0]+B[1][1]+B[2][2]==3||
       B[2][0]+B[1][1]+B[0][2]==3){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
    
            
  }
  

  
}