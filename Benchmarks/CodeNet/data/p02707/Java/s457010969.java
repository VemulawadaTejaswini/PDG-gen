import java.util.*;
import java.io.*;
public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //Scanner sc = new Scanner(System.in);
    //int n = sc.nextInt();
    int n =Integer.parseInt(br.readLine());
    ArrayList<Integer> arr = new ArrayList<Integer>();
    for(int i=1;i<=n;i++){
      arr.add(i);
    }
    String s = br.readLine();
    String[] str = s.trim().split("\\s+");
    TreeMap<Integer, Integer> map = new TreeMap<Integer,Integer>();
    for(int i=0;i<n-1;i++){
      //int a = sc.nextInt();
      int a = Integer.parseInt(str[i]);
      if(map.get(a)!=null){
        map.put(a, map.get(a)+1);
      }
      else{
        map.put(a,1);
        arr.remove((Integer)a);
      }
    }
    for(int i=0;i<arr.size();i++){
      map.put(arr.get(i),0);
    }
    map.forEach((k, v) -> System.out.println(v)); 
  }
}