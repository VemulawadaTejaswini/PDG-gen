import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int[] val = new int[N];
    ArrayList<Integer[][]> list = new ArrayList<>();
    for(int i = 0; i < N; i++){
      val[i] = Integer.parseInt(sc.nextLine());
      Integer[][] num = new Integer[val[i]][2];
      for(int j = 0; j < val[i]; j++){
        String[] S = sc.nextLine().split(" ");
        num[j][0] = Integer.parseInt(S[0]);
        num[j][1] = Integer.parseInt(S[1]);
      }
      list.add(num);
    }
    
    int max = 0;
    c : for(int i = 0; i < Math.pow(2,N); i++){
      long M = Long.parseLong(Integer.toBinaryString(i));
      String bit = String.format("%015d", M);
      for(int j = 0; j < N; j++){
        int L = val[j];
        if(bit.charAt(15-j-1) == '0'){
          continue;
        }
        Integer[][] num = list.get(j);
        for(int k = 0; k < L; k++){
          int P = num[k][0];
          if(bit.charAt(15-P) != num[k][1]+'0'){
            continue c;
          }
        }
      }
      int count = 0;
      for(int j = 1; j <= N; j++){
        if(bit.charAt(15-j) == '1'){
          count++;
        }
      }
      if(count > max){
        max = count;
      }
    }
    System.out.println(max);
  }
}