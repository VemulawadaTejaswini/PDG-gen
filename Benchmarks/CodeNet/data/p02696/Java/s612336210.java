import java.util.*;

class Main{

  static int floor(double d){ 
    if(d>=0)return (int)(d);
    else if((int)(d)-d==0) return (int)(d);
    else return (int)(d)-1;
  }
  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
	int A=s.nextInt();
	int B=s.nextInt();
	int N=s.nextInt();    
    int max=Integer.MIN_VALUE;
    for(int i=0;i<=N;i++) if(floor(A*i/B)-A*(floor(i/B))>max) max=floor(A*i/B)-A*(floor(i/B));
    System.out.println(max);
  }
}