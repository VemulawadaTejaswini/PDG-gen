import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    HashMap<Integer,String> hm=new HashMap<Integer,String>();
    String s,check;
    int p,ac=0,wa=0;
    for(int i=0;i<m;i++){
      check="";
      p=sc.nextInt();
      s=sc.next();
      if(hm.get(p)!=null) check=hm.get(p);
      if(check.equals(s)!=true&&(!(check.equals("AC")&&s.equals("WA")))){
        if(s.equals("AC")) ac++;
        else if(s.equals("WA")) wa++;
        hm.put(p,s);
      }
    }
    System.out.print(ac+" ");
    System.out.println(wa);
  }
}