import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A[][]= new int[N][N-1];
    Stack stack = new Stack();
    for(int i=0;i<N;i++){
      for(int j=0;j<N-1;j++){
        A[i][j]=sc.nextInt();
      }
    }
    int answer = 0;
    int gameCnt=0;
    int daygame=0;
    int tmp=0;
    List<Integer> done = new ArrayList<Integer>();
    while(gameCnt<N*(N-1)/2){
      done.clear();
      daygame=0;
     for(int i=0;i<N;i++){
       if(done.contains(i)){
         continue;
       }
       boolean fin = true;
       for(int k=0;k<N-1;k++){
         if(A[i][k]!=0){
           tmp=k;
           fin=false;
           break;
         }
       }
       if(!fin){
         break;
       }
       for(int j=0;j<N-1;j++){
         if(A[A[i][tmp]][j]!=0){
           if(A[A[i][tmp]][j]==i){
             A[A[i][tmp]][j]=0;
             A[i][tmp]=0;
             gameCnt=gameCnt+1;
             daygame=daygame+1;
             done.add(i);
             done.add(A[i][tmp]);
           }
         }
       }
     }
     if(daygame==0){
         answer=-1;
         break;
       }
      answer=answer+1;
    } 
System.out.println(answer);
    
    //    for(int a=0;a<N;a++){
//      for(int b=0;b<N-1;b++){
//    System.out.println(A[a][b]);
//      }
//    }
  }
}