import java.util.*;
class Solution{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int result=0;
    if(x>=400&&x<=599)
      result=8;
    else if(x>=600&&x<=799)
      		result=7;
    else if(x>=800&&x<=999)
      		result=6;
    else if(x>=1000&&x<=1199)
      		result=5;
    else if(x>=1200&&x<=1399)
      		result=4;
    else if(x>=1400&&x<=1599)
      		result=3;
    else if(x>=1600&&x<=1799)
      		result=2;
    else if(x>=1800&&x<=1999)
      		result=1;
    System.out.println(x);
  }
}