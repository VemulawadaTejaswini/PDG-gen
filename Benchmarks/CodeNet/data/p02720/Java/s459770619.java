import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int k=sc.nextInt();
    Deque<Long> dq=new ArrayDeque<>();
    if(k<10){
      System.out.println(k);
      return;
    }
    for(long i=1;i<10;i++){
      dq.addLast(i);
    }
    int cnt=9;
    while(true){
      long x=dq.pollFirst();
      long bi=x%10;
      if(bi!=0){
        dq.addLast(x*10+bi-1);
        cnt++;
        if(cnt==k){break;}
      }
      dq.addLast(x*10+bi);
      cnt++;
      if(cnt==k){break;}
      if(bi!=9){
        dq.addLast(x*10+bi+1);
        cnt++;
        if(cnt==k){break;}
      }
    }
    System.out.println(dq.peekLast());
  }
}