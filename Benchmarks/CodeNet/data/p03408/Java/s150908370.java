import java.util.Scanner;
import java .util.streem.Collectors;
class Main{
  public static void main(String[]args){
    HsshMap<String, Integer>map =new HashMap<>();

    Scanner stdIn=new Scanner(System.in);
    int N=stdIn.nextInt();
    for(int i=0;i<N;i++){
      String s=sc.next();
      map.put(s,map.getOrDefault(s,0)+1);
    }
    int M=stdIn.nextInt();
    for(int j=0;j<M;j++){
      String s=sc.next();
      map.put(s,map.getOrDefault(s,0)-1);
}
    map=map.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue().reversed()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));

    System.out.println(Math.max(map.values().stream().findFirst().get(),0));


}
}