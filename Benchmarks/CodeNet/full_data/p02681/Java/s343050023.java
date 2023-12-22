class Main{
	
}import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String a=sc.nextLine(),b=sc.nextLine();
    b = b.substring(0,a.length());
    if(a.equals(b)){
      pl("Yes");
    }else{
      pl("No");
    }
  }

  public static void pr(String str){
    System.out.print(str);
  }
  public static void pl(String str){
    System.out.println(str);
  }
}
