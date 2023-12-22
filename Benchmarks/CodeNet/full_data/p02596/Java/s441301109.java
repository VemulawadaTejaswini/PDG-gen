import java.util.*;
 
class Main (String[] args){
  Scanner　sc = new Scanner(System.in);
  int K = sc.nextInt();
  int R = -1;
  int Ar = 7;
  for(int i = 0;i<=K;i++){
    if(Ar%K == 0){
      R = i+1;
    }else{
      Ar+= 7*Math.pow(10,i+1);
    }
  }
}