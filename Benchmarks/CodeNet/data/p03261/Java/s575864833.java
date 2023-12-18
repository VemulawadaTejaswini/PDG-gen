import java.util.*;

public class Main {
    public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);

    int n=sc.nextInt();
    String w[]=new String[n];
    for(int i=0;i<n;i++){
      w[i]=sc.next();
    }

    if(noequ(w,n)==true && equ(w,n)==true){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }



	}

  public static boolean noequ(String[]w,int n){
    boolean ans=true;
    for(int i=0;i<n-1;i++){
      for(int s=i+1;s<n;s++){
        if(w[i].equals(w[s])){
          ans=false;
        }
      }
    }
    if(ans==true){
      return true;
    }else{
      return false;
    }
  }

  public static boolean equ(String[]w,int n){
    boolean ans=true;
    for(int i=0;i<n-1;i++){
      if(w[i].charAt(w[i].length()-1)!=w[i+1].charAt(0)) {
        ans=false;
      }
    }
    if(ans==true){
      return true;
    }else{
      return false;
    }
  }

}
