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

    int stay[]=new int[n];
    int result=0;
    for(int i=0;i<n;i++){
      //System.out.println(s.substring(1,i)+" "+s.substring(i));
      stay[i]=countChar(s.substring(0,i),'E')+countChar(s.substring(i),'W');
    }
    Arrays.sort(stay);
    System.out.println(n-stay[n-1]);

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