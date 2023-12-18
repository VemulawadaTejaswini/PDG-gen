import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),f=1;
    HashMap<String,Integer> map=new HashMap<String,Integer>();
    List<String> list=new ArrayList<String>();
    for(int i=0;i<n;i++){
      String s=sc.next();
      if(map.get(s)==null){
        map.put(s,1);
      }else{
        map.put(s,map.get(s)+1);
        if(map.get(s)>f){
          f=map.get(s);
        }
      }
    }
    for(String key:map.keySet()){
      if(map.get(key)==f){
        list.add(key);
      }
    }
    Collections.sort(list);
    for(int i=0;i<list.size();i++){
      System.out.println(list.get(i));
    }
  }
}
