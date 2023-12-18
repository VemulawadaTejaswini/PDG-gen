import java.util.*;
public class Main {
public static void main(String[] args){
Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  int stick[]=new int[n];
  for(int i=0;i<n;i++){
  stick[i]=s.nextInt();
  }
  int cnt=0;
  for(int i=0;i<n;i++){
  for(int j=i+1;j<n;j++){
  for(int k=j+1;k<n;k++){
  int a=stick[i];
    int b=stick[j];
    int c=stick[k];
    if(a<(b+c)&&b<(a+c)&&c<(a+b))
      cnt++;
  }
  }
  }
  System.out.print(cnt);
}
}