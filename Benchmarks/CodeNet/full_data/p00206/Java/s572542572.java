import java.util.*;

public class Main {
  public static void main(String[] args){
    //declare
    ArrayList<String> answer = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    int L,str,M,N,MN,m;
    //inmput
    while(true){
      str = m = 0;
      L = Integer.parseInt(in.next());
      if(L==0){break;}
      //calculate
      for(int i=0;i<12;i++){
        M = Integer.parseInt(in.next());
        N = Integer.parseInt(in.next());
        MN = M - N;
        str += MN;
        if(str<L){m = i+2;}
      }
      if(str>=L){answer.add(String.valueOf(m));}
      else{answer.add("NA");}
    }
    //output
    for(String s:answer){System.out.println(s);}
  }
}