import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int Q = sc.nextInt();
  for(int i = 0;i < Q;i++){
    long A = sc.nextLong();
long B = sc.nextLong();
if(A == B){
  System.out.println((A-1)*(A-1));
}
else{
  double border = Math.sqrt(A*B);
  long irre = 0;
  for(long j = (long) Math.ceil(border);;j++){
    long p;
    long q;
    for(long k = 1;;k++){
      if(j*k >= A*B){
        p = k-1;
        break;
      }
    }
    for(long k = 1;;k++){
      if((j+1)*k >= A*B){
        q = k-1;
        break;
      }
    }
    if(p == q){
      irre = j;
      break;
    }
  }
  long ans = 0;
  if(Math.floor(border)*(Math.floor(border) + 1) <= A*B){
    ans = (long) (2 * Math.floor(border));
    if(!(A > irre || B > irre))ans--;
    System.out.println(ans-1);
  }
  else{
    ans = (long) (2 * Math.floor(border));
    if(!(A > irre || B > irre))ans--;
    System.out.println(ans-2);
  }
}
}
}
}