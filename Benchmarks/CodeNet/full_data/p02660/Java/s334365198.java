import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  long N=sc.nextLong(),res=0,M=N;
      for(int i=2;N!=1&&i<(int)Math.sqrt(M);i++){
          if(N%i==0){
              int s=0,t=1;
              while(N%i==0){
                  N/=i;
                  s++;
                  if(s==t){
                      s-=t;
                      t++;
                  }
              }
              res+=t-1;
          }
      }
      if(N!=1) res++;
      System.out.println(res);
	  sc.close();
	}

}