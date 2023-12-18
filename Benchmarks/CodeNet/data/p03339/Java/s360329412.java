import java.util.*;

class Main{
	int n;
  String s;
  

  public static void main(String[] ar){
    new Main();
  }
  public Main(){
  	Scanner sc=new Scanner(System.in);
  	n=Integer.parseInt(sc.nextLine());
    s=sc.nextLine();

    int ee=countChar(s,'E');

    int stay=0;
    int result=0;
    for(int i=0;i<n;i++){
      //System.out.println(s.substring(1,i)+" "+s.substring(i));
      int e=countChar(s.substring(0,i),'E');
      //System.out.println(e);
      stay=e+n-i-(ee-e);
      if(result<stay) result=stay;
    }
    System.out.println(n-result);

    //System.out.println(countChar(s));
  }
  public int countChar(String str,char c){
    int sum=0;
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)==c) sum++;
    }
    return sum;
  }
}