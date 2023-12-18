import java.util.*;


public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int K = sc.nextInt();
    int count=1;
    if(K==count)
  System.out.println(s);
outer:for(int i=1;i<5;i++){
  ArrayList<String> list = new ArrayList<String>();
for(int j=0;j<=i;j++){
  String sub = s.substring(j,s.length()-j);
  if(!list.contains(sub)){
    list.add(sub);
    count++;
    if(count==5){
      System.out.println(list.get(list.size()-1));
      break outer;
          }
  }
}
}
  }
}
