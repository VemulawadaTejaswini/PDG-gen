import java.util.Scanner;
import java.util.Arrays;

class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int H = Integer.parseInt(scanner.next());
    int W = Integer.parseInt(scanner.next());
    int N = Integer.parseInt(scanner.next());
    Info[] infos = new Info[N*9];
    Info[] inputInfo = new Info[9];
    int a_i = 0;
    int b_i = 0;

    for(int i=0; i<N; i++){
      a_i = Integer.parseInt(scanner.next());
      b_i = Integer.parseInt(scanner.next());
      for(int h=-1; h<=1; h++){
        for(int w=-1; w<=1; w++){
          inputInfo[h*3+w+4] = new Info(a_i+h, b_i+w, H, W);
        }
      }
      for(int index=0; index<=8; index++){
        for(int j=0; j<N*9; j++){
          if(infos[j] == null){
            infos[j] = inputInfo[index];
            break;
          }else{
            if(infos[j].isEqual(inputInfo[index])){
              infos[j].addBlack();
              break;
            }
          }
        }
      }
      for(int h=-1; h<=1; h++){
        for(int w=-1; w<=1; w++){
          inputInfo[h*3+w+4] = null;
        }
      }
    }

    scanner.close();

    long count = 0;
    int[] ans = new int[10];
    for(int i=0; i<N*9; i++){
      if(infos[i] == null){
        break;
      }else if(infos[i].isExist()){
        ans[infos[i].getBlack()] ++;
        count ++;
      }
    }

    System.out.println(((long)W-2l)*((long)H-2l)-count);
    for(int i=1; i<10; i++){
      System.out.println(ans[i]);
    }
  }
}

class Info{
  int a = 0;
  int b = 0;
  int black = 1;
  boolean isExist = false;

  public Info(int a_in, int b_in, int H, int W){
    a = a_in;
    b = b_in;
    if((2<=a && a<=H-1) && (2<=b && b<=W-1)){
      isExist = true;
    }
  }

  public boolean isEqual(Info info){
    if(a==info.getA() && b==info.getB()){
      return true;
    }else{
      return false;
    }
  }

  public int getA(){
    return a;
  }

  public int getB(){
    return b;
  }

  public int getBlack(){
    return black;
  }

  public boolean isExist(){
    return isExist;
  }

  public void addBlack(){
    black ++;
  }
}
