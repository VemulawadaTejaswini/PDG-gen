import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    int x=scn.nextInt();
    int x_=x;
    int n=scn.nextInt();
    ArrayList<Integer> p=new ArrayList<>();
    
    for(int i=0;i<n;i++){
      p.add(scn.nextInt());
    }
    Collections.sort(p);
    int a=0;
    int ans=x;
OUT: for(int i=0;i<p.size();i++){
      if(x<=p.get(i)||i>=p.size()){
        a=i;
        for(int j=a;j>=0;j--){
          if(x_-p.get(j)==0){
            x_--;
          }else if(x_>p.get(j)){
            a=x-x_;
            ans=x_;
            x_=x;
            break;
          }
        }
 
        for(int j=i-1;j<p.size();j++){
          if(x_-p.get(j)==0){
            x_++;
          }else if(x_>x+a-1){
            break OUT;
          }else if(x_<p.get(j)){
            ans=x_;
            break OUT;
          }
        }
      }
    }
    if(x_-x<a){
      ans=x_;
    }
    System.out.println(ans);
  }
}
