import java.util.Scanner;

class Tower{
  int hight;
  boolean good = True;
}

public class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    
    int N = scan.nextInt();
    int M = scan.nextInt();
    
    Tower[] tower = new Tower[N];
    
	for(int n = 0; n < N; n++){
      tower[n] = new Tower();
      tower[n].hight = scan.nextInt();
    }
    
    int el;
    int pt;
    for(int m = 0; m < M; m++){
      el = scan.nextInt()-1;
      pt = scan.nextInt()-1;
      if(tower[el].hight > tower[pt].hight){
        if(tower[pt].good){
          N--;
          tower[pt].good = False;
        }
      }else if(tower[el].hight < tower[pt].hight){
        if(tower[el].good){
          N--;
          tower[el].good = False;
        }
      }else{
         if(tower[pt].good){
          N--;
          tower[pt].good = False;
        }
        if(tower[el].good){
          N--;
          tower[el].good = False;
        }
      }
    }
    
    System.out.println(N);
  }
}