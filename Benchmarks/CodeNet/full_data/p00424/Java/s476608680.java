import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    ArrayList<String> array2 = new ArrayList<String>();
    while (in.hasNext()){
      StringBuilder sb = new StringBuilder();
      HashMap<String,String> map1 = new HashMap<String,String>();
      ArrayList<String> array1 = new ArrayList<String>();
      int n1 = in.nextInt();
      if (n1 == 0){
        break;
      }
      for (int i = 0; i < n1; i++){
        String a1 = in.next();
        String b2 = in.next();
        map1.put(a1,b2);
     }
      int n2 = in.nextInt();
      for (int i = 0; i < n2; i++){
        String key = in.next();
        if (map1.containsKey(key)){
          array1.add(map1.get(key));
        }else{
          array1.add(key);
        }
      }
      for (int i = 0; i < array1.size(); i++){
        sb.append(array1.get(i));
      }
      String s = sb.toString();
      array2.add(s);
    }
    for (String sss: array2){
      System.out.println(sss);
    }
  }
}