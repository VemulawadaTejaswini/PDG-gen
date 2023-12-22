import java.util.Scanner;
import java.util.ArrayList;
class Main{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
 
int N = scan.nextInt();
int M = scan.nextInt();
int H[] = new int[N];
int I[] = new int[N];
int peaks[] = new int[2];
int i;
int count = 0;

  for(i=0; i<N; i++){
    H[i]=scan.nextInt();
  }
  for(i=0; i<M; i++){
    peaks[0]=scan.nextInt();
    peaks[1]=scan.nextInt();
    if (H[peaks[0]-1] > H[peaks[1]-1]){
      I[peaks[1]-1]=1;
    }
    else if(H[peaks[0]-1] < H[peaks[1]-1]){
      I[peaks[0]-1]=1;
    }
    else{
      I[peaks[1]-1]=1;
      I[peaks[0]-1]=1;
    }
  }
  
  for(i=0; i<N; i++){
    if (I[i]==0){
      count += 1;
    }
    else{
    }
  }
  
  System.out.println(count);
 }
}