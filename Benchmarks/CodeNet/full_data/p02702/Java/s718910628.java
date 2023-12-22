import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char[] arr = s.toCharArray();
    int[] vec = new int[2019];
    int[] temp;
    vec[Character. getNumericValue(arr[0])]=1;
    int count =0;
    //System.out.println("anuj"+vec[1]);
    for(int i=1;i<s.length();i++){
      temp = new int[2019];
      for(int j=0;j<2019;j++){
        if(vec[j]>0){
          //System.out.println("j "+j);
          int num = (j*10+Character. getNumericValue(arr[i]))%2019;
          //System.out.println(num);
          temp[num]=temp[num]+1;
        }
      }
      temp[Character. getNumericValue(arr[i])]++;
      for(int k=0;k<2019;k++){
        vec[k]=temp[k];
      }
      count = count+vec[0];
    }
    System.out.println(count);
  }
}