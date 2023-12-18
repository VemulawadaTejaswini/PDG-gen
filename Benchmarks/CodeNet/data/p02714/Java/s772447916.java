import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N=sc.nextInt();
    String S = sc.next();
    String s[] =S.split("",0);
    int t[] =new int[N];
    int x=0;int w=0;int a=0;int b=0; int c=0;
    for(int i=0;i<N;i++){
      if(s[i].equals("R")){t[i]=1;b=b+1;}
      else if(s[i].equals("G")){t[i]=2;a=a+1;}
      else{t[i]=3;c=c+1;}}
    for(int k=1;k<N-2;k++){
      float l=(k+N)/2;
      for(int j=k+1;j<=l;j++){
        if(t[k-1]==t[j-1]){continue;}
          if(t[k-1]+t[j-1]+t[2*j-k-1]==6){
            w=w+1;}}}
    int z=a*b*c;
    System.out.println(z-w);
  }
}
