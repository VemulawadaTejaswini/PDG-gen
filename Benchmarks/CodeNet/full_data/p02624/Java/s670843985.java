import java.util.*;
class Main{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int t=sc.nextInt();
  long sum=0;
  for(int i=1;i<=t;i++){
long k=number(i);
    sum=sum+k*i;
  }
  System.out.println(sum);
}
  static long number(int i){
long coun=0;
    for(int j=1;j*j<=i;j++){
if(i%j==0) {
			coun++;
		}
		if((i/j)!=j&&(i%(i/j)==0)) {
			coun++;
		}
    }
    return coun;
  }
}
    
    
    
    