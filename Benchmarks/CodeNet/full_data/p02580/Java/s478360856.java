import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] tem = sc.nextLine().split(" ");
    int H = Integer.parseInt(tem[0]);
    int W = Integer.parseInt(tem[1]);
    int M = Integer.parseInt(tem[2]);
    
    int[] Harray = new int[H];
    int[] Warray = new int[W];
    
    HashSet<String> Set = new HashSet();
    
    String HW;

    for(int i = 0; i < M; ++i) {
      HW = sc.nextLine();
      Set.add(HW);
      tem = HW.split(" ");
      ++Harray[Integer.parseInt(tem[0]) - 1];
      ++Warray[Integer.parseInt(tem[1]) - 1];
    }
    
    int Hmax = 0;
    for(int i = 0; i < Harray.length; ++i) {
      if(Harray[i] > Hmax) {
        Hmax = Harray[i];
      }
    }
    int Wmax = 0;
    for(int i = 0; i < Warray.length; ++i) {
      if(Warray[i] > Wmax) {
        Wmax = Warray[i];
      }
    }
    
    int max = Hmax + Wmax - 1;
    check:
    for(int i = 0; i < Harray.length; ++i) {
        if(Harray[i] == Hmax) {
            for(int j = 0; j < Warray.length; ++j) {
                if(Warray[j] == Wmax) {
                    if(!Set.contains((i + 1) + " " +(j + 1))) {
                        ++max;
                        break check;
                    }
                }
            }
        }
    }
    
    System.out.println(max);
  }
}