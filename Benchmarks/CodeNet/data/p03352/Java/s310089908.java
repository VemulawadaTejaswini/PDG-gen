import java.util.*;


public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
ArrayList<Integer> list = new ArrayList<Integer>();
ArrayList<Integer> plist = new ArrayList<Integer>();
for(int i=2;i<32;i++){
  boolean judge=true;
  int count=2;
  while(judge){
    if(Math.pow(i,count)<1000){
      list.add((int)Math.pow(i,count));
      count++;
    }else{
      judge=false;
    }
  }
}

for(int i:list){
  if(i<=x){
    plist.add(i);
  }
}
        System.out.print(plist.get(plist.size()-1));

  }
}
