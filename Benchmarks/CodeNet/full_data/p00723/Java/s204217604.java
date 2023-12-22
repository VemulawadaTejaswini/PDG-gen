import java.util.*;

class Main{
  public static Scanner cin;
  public static HashMap<String,Integer> m;

  public static String reverse(String s){
    return new StringBuffer(s).reverse().toString();
  }

  public static void arrange(){
    String s=cin.nextLine();
    m=new HashMap<String,Integer>();
    int i=1;
    for(;i<s.length();i++){
      String s1=s.substring(0,i),s2=s.substring(i);
      m.put(s1+s2,1);
      m.put(reverse(s1)+s2,1);
      m.put(s1+reverse(s2),1);
      m.put(reverse(s1)+reverse(s2),1);
      m.put(s2+s1,1);
      m.put(reverse(s2)+s1,1);
      m.put(s2+reverse(s1),1);
      m.put(reverse(s2)+reverse(s1),1);
    }
    System.out.println(m.size());
  }

  public static void main(String []args){
    cin=new Scanner(System.in);
    int i=0,n=cin.nextInt();
    cin.nextLine();
    for(;i<n;i++)arrange();
  }
}