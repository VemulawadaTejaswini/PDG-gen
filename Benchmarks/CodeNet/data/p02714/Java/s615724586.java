import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N=sc.nextInt();
    String S = sc.next();
    String s[] =S.split("",0);
    int t[] =new int[N];
    int x=0;
    for(int i=0;i<N;i++){
      if(s[i].equals("R")){t[i]=1;}
      else if(s[i].equals("G")){t[i]=2;}
      else{t[i]=3;}}
    for(int j=1;j<N-1;j++){
      for(int k=j+1;k<N;k++){
        if(t[j-1]==t[k-1]){continue;}
        for(int l=k+1;l<N+1;l++){
          if(l!=2*k-j){
          if(t[j-1]+t[k-1]+t[l-1]==6){
            x=x+1;}}}}}
    System.out.println(x);
  }
}
