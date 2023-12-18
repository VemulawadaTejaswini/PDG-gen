import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N=sc.nextInt();
    String S = sc.next();
    String s[] =S.split("",0);
    int t[] =new int[N];
    long w=0;int a=0;int b=0; int c=0;
    for(int i=0;i<N;i++){
      if(s[i].equals("R")){t[i]=1;b=b+1;}
      else if(s[i].equals("G")){t[i]=2;a=a+1;}
      else{t[i]=3;c=c+1;}}
    for(int k=2;k<N;k++){
      for(int j=1;j<k;j++){
        if(2*k-j>N){continue;}
        if(t[k-1]==t[j-1]){continue;}
          if(t[k-1]+t[j-1]+t[2*k-j-1]==6){
            w=w+1;}}}
    long z=a*b*c;
    System.out.println(z-w);
  }
}