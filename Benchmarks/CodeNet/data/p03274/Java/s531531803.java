import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
 
 public static void main(String[] args) {

 Scanner in = new Scanner(System.in);
 int N = in.nextInt();
 int M = in.nextInt();

 Integer[] numbers = new Integer[N];
 for (int i = 0; i < N; i++) {
  numbers[i] = in.nextInt();
 }
 if (M <= 0 || numbers == null) {
  return;
 }
 
 List<Integer> fushu = new ArrayList<Integer>();
 List<Integer> zhengshu = new ArrayList<Integer>();
 for(int i = 0; i < numbers.length; i++){
  if(numbers[i] < 0){
   fushu.add(numbers[i]);
  } else {
   if(zhengshu.size() < M){
    zhengshu.add(numbers[i]);
   } else {
    break;
   }
  }
 }
 
 List<Integer> fushu2 = new ArrayList<Integer>();
 for(int i = 1; i<fushu.size(); i++){
  if(fushu2.size() < M){
   fushu2.add(fushu.get(fushu.size()-i));
  } else {
   break;
  }
 }
 fushu2.addAll(zhengshu);
 
 Integer[] numbers2 = new Integer[fushu2.size()];
 for (int i=0; i<fushu2.size(); i++) {
  numbers2[i] = fushu2.get(i);
 }

 List<Integer> stringList = new ArrayList<Integer>();
 for (int i = 0; i < M; i++) {
  stringList.add(-99999999);
 }

 Integer minVal = null;
 int resultValue = listAll(stringList, numbers2, M, minVal);
 System.out.println(resultValue);
}

 public static Integer listAll(List<Integer> list, Integer[] intArr, int n,
   Integer minVal) {

  if (n == 0) {
   int temMinValue = Math.abs(list.get(0) - 0);
   for (int i = 1; i < list.size(); i++) {
    temMinValue += Math.abs(list.get(i) - list.get(i - 1));
   }

   if (minVal == null || minVal > temMinValue) {
    minVal = temMinValue;
   }
   return minVal;
  }

  for (Integer integer : intArr) {
   if (!list.contains(integer)) {
    list.set(list.size() - n, integer);
   } else {
    continue;
   }

   minVal = listAll(list, intArr, n - 1, minVal);
   list.set(list.size() - n, -99999999);
  }
  return minVal;
 }

}
