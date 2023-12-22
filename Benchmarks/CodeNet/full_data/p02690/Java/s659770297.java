import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    int ans1=0, ans2=0;
    boolean allflag=true, flag1=true, flag2=true;
    int gcd=2;
    if(num==1){
      ans1=0;
      ans2=-1;
    }else{
      while(allflag){
      while(flag1){
        if(num%gcd==0){
          flag1=false;
        }else{
          gcd++;
        }
      }
      ans1=gcd;
      ans2=0;
      while(flag2){
        if(Math.pow(ans1,5)-Math.pow(ans2,5)==num){
          flag2=false;
          allflag=false;
        }else{
          ans1--;
          ans2--;
        }
        if(ans1<0){
          flag2=false;
          gcd++;
        }
      }
      }
    }
    System.out.println(ans1+" "+ans2);
  }
}