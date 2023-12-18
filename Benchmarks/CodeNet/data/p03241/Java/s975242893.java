import java.util.Scanner;

public class Main{
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
long N = sc.nextLong();
long M = sc.nextLong();
long ans=-1;
for(long i=1;i<=Math.floor(M/N);i++){
  if(M%i==0){
    ans=i;
  }
}


System.out.println(ans);
}
}
