import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    int N=s.nextInt();
    String ans="";
	for(;0<N;){
      char c=(char)(N%26+96);
      ans=String.valueOf(c)+ans;
      N/=26;
    }
    System.out.println(ans);

  }  
}