import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int w=sc.nextInt();
    int h=sc.nextInt();
    int x=sc.nextInt();
    int y=sc.nextInt();
  int flg=0;
  int ans1=0;
  int ans2=0;
  
  if(w==x){
    flg=1;
  }
  else{
    int tmp1=(x-0)*h;
    int tmp2=(w-x)*h;
    
    if(tmp1<tmp2){
      ans1=tmp1;
    }
    else{
      ans1=tmp2;
    }
  }
  
  if(h==y){
    flg=1;
  }
  else{
    int tmp1=(y-0)*w;
    int tmp2=(h-y)*w;
    
    if(tmp1<tmp2){
      ans2=tmp1;
    }
    else{
      ans2=tmp2;
    }
  }
  int ans=0;
  
  if(flg==0&&ans1<ans2){
    ans=ans2;
    flg=1;
  }
  else if(flg==0&&ans2<ans1){
    ans=ans1;
    flg=1;
  }
  else if(flg==0&&ans1==ans2){
    ans=ans1;
  }
  
  double num=(double)ans;
  System.out.print(String.format("%.6f", num)+" ");
  
  if(flg==1){
    System.out.println("0");
  }
  else{
    System.out.println("1");
  }
    
  }
}
