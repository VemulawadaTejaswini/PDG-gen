import jaca.util.*;


class Main(){
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    ArrayList<String> list = new ArrayList<String>();
    for(int i = 0; i < a.length(); i++){
      list.add = a.charAt(i);
    }
    Collection.sort(list);
    int flag = 0;
    String ans = No;
    for(int i = 0; i < list.size() - 1; i ++){
      if(list.get(i) == list.get(i + 1)){
        flag++;
      }
    }
    if(flag = 1){
      ans = "Yes";
    }
    System