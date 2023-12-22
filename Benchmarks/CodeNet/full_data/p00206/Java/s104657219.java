import java.util.*;

class Main {
  public static void main(String[] args){
    //declare
    ArrayList<String> answer = new ArrayList<>();
    ArrayList<Integer> month = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    int L,M,N,total;
    //inmput
    while(true){
      total=0;
      L = Integer.parseInt(in.next());
      if(L==0){break;}
      //calculate
      for(int i=1;i<=12;i++){
        M = Integer.parseInt(in.next());
        N = Integer.parseInt(in.next());
        total += M - N;
        if(L-total<=0){month.add(i);}
      }
      if(total>=L){answer.add(String.valueOf(month.get(0)));}
      else{answer.add("NA");}
    }
    //output
    for(String s:answer){System.out.println(s);}
  }
}