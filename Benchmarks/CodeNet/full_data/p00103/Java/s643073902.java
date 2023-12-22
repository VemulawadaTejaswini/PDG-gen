import java.util.*;

class Main{
  public static void main(String[] args){
  ArrayList<String> hit = new ArrayList<String>();
  ArrayList<String> out = new ArrayList<String>(); 
  ArrayList<Integer> A = new ArrayList<Integer>();
  int score = 0;
  Scanner in = new Scanner(System.in);
  int n = in.nextInt();
  while (in.hasNext()){
  String str = in.nextLine();
  //??\?????§HIT,Out,HOMERUN??????????????????
  if(str.equals("HIT")){
    if(hit.size() < 3){
      hit.add("1");
    }else{
      score += 1;
    }
  }else if(str.equals("HOMERUN")){
    score += hit.size() + 1;
    hit.clear();
  }else if(str.equals("OUT")){
    if(out.size() < 2){
      out.add("1");
    }else{
      A.add(score);
      hit.clear();
      out.clear();
      score = 0;
    }
  }
  }
  for(int s: A){
    System.out.println(s);
  }
  }
}