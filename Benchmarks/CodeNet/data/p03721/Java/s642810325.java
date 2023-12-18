import java.util.Scanner;

public class Main{
  public static void main(String[] args){

    Scanner scn = new Scanner(System.in);
    String nm = scn.nextLine();
    String nStr = nm.split(" ",0)[0];
    String kStr = nm.split(" ",0)[1];
    int n = Integer.parseInt(nStr);
    int k = Integer.parseInt(kStr);

    int[] nums = new int[n];
    int[] sizes = new int[n];

    for(int i=0; i<n; i++){
      String oneLine = scn.nextLine();
      String numStr = oneLine.split(" ",0)[0];
      String sizeStr = oneLine.split(" ",0)[1];
      int num = Integer.parseInt(numStr);
      int size = Integer.parseInt(sizeStr);

      nums[i] = num;
      sizes[i] = size;

    }

    int point = 0;
    int i = 0;
    while(true){
      point += sizes[i];
      if(point >= k){
        System.out.println(nums[i]);
        break;
      }else{
        i++;
      }
    }
  }
}
