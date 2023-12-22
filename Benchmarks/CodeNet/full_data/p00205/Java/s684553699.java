//AOJ 0205
import java.util.*;

class Main{
  public static void main(String[] args){

    //declare
    Scanner in = new Scanner(System.in);
    Set<Integer> zya = new HashSet<Integer>();
    ArrayList<Integer> array  = new ArrayList<Integer>();
    ArrayList<Integer> array2 = new ArrayList<Integer>();
    int a,b,c,d,e;

    //imput
    while (true){
      a = in.nextInt();
      if(a==0){break;}
      zya.add(a);
      array.add(a);
      for(int i=0;i<4;i++){
        b = in.nextInt();
        zya.add(b);
        array.add(b);
      }

      //calculate
      if(!(zya.contains(1)) && zya.contains(2) && zya.contains(3)){
        c = 0; d = 1; e = 2;
      }else if(zya.contains(1) && !(zya.contains(2)) && zya.contains(3)){
        c = 2; d = 0;e = 1;
      }else if(zya.contains(1) && zya.contains(2) && !(zya.contains(3))){
        c = 1; d = 2; e = 0;
      }else{
        c=d=e=3;
      }
      for(int i=0;i<5;i++){
        if(array.get(i) == 1){array2.add(c);}
        if(array.get(i) == 2){array2.add(d);}
        if(array.get(i) == 3){array2.add(e);} 
      }
      array.clear();
      zya.clear();
    }
    
    //output
    for(int s: array2){System.out.println(s);}
  }
}