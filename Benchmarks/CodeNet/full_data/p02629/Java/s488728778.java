import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    long n=scn.nextLong();
    
    long a=n;
    long b=n;
    String s="";
    while(b>0){
    	a%=26;
        b/=26;
    switch((int)a){
      case 1:
        s+="a";
        break;
      case 2:
        s+="b";
        break;
      case 3:
        s+="c";
        break;
      case 4:
        s+="d";
        break;
      case 5:
        s+="e";
        break;
      case 6:
        s+="f";
        break;
      case 7:
        s+="g";
        break;
      case 8:
        s+="h";
        break;
      case 9:
        s+="i";
        break;
      case 10:
        s+="j";
        break;
      case 11:
        s+="k";
        break;
      case 12:
        s+="l";
        break;
      case 13:
        s+="m";
        break;
      case 14:
        s+="n";
        break;
      case 15:
        s+="o";
        break;
      case 16:
        s+="p";
        break;
      case 17:
        s+="q";
        break;
      case 18:
        s+="r";
        break;
      case 19:
        s+="s";
        break;
      case 20:
        s+="t";
        break;
      case 21:
        s+="u";
        break;
      case 22:
        s+="v";
        break;
      case 23:
        s+="w";
        break;
      case 24:
        s+="x";
        break;
      case 25:
        s+="y";
        break;
      case 0:
        s+="z";
        break;
    }
    }
    String ans=new StringBuffer(s).reverse().toString();
    System.out.println(ans);
  }
}