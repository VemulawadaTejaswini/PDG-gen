import java.util.*;
public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int num=1;
boolean[] facs=new int[n];
for(int i=2;i<=n;i++){
  if(!facs[i-1]){
    int mem_i=i;
    facs[i-1]=true;
    int mem_n=check(i);
    while(mem_i<=n){
      mem_i*=i;
      facs[mem_i-1]=true;
      mem_n+=check(mem_i);
    }
    num*=(mem_n+1);
  }
}
System.out.println(num);
}
int check(int k){
  if(n%k==0)return n/k;
  return 0;
}
}
