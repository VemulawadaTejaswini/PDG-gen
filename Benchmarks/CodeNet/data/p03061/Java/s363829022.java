
import java.util.*;

class Main{
	public static void main(String[] args){
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int[] numbers = new int[n];
      for(int i =0;i<n;i++){
        numbers[i] =scn.nextInt();
      }
      int max = 1;
      for(int j = 0;j<n;j++){
        List<Integer> remove = new ArrayList<>();
        for(int l = 0; l <n;l++){
          if(l != j){
            remove.add(numbers[l]);
          }
        }
        if(max<listCommonDivisor(remove)){
          max = listCommonDivisor(remove);
        }
      }
      System.out.println(max);
	}
  
  public static int twoCommonDivisor(int a,int b){
        int temp;
    	if(b > a){
          int c = b;
          b = a;
          a = c;
        }
        while ((temp = a % b) != 0) {
            a = b;
            b = temp;
        }
    	return b;
  }
  
  public static int listCommonDivisor(List<Integer> list){
    int len = list.size();
    int tmp = list.get(0);
    for(int k = 0;k<len;k++){
         tmp = twoCommonDivisor(tmp,list.get(k));
    }
    return tmp;
  }
}