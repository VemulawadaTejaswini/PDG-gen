import java.util.*;

public class Main {
 public static void main(String[] argv) {
  int n;
  Scanner in = new Scanner(System.in);
  n = in.nextInt();
  int[] list = new int[n];
  for(int i = 0; i < n; i ++) {
   list[i] = in.nextInt();
  }
  for(int i = 0; i < n; i ++) {
   System.out.println(calculation(list, i));
  }
 }
 
 public static String calculation(int[] list, int i){
  int id = i+1;
  int k = list[i];
  int pk = 0;
  int lk = 0;
  int rk = 0;
  String combination = "node " + id + ": key = " + k + ", ";
  if(id != 1){
    combination = combination + "parent key = " + list[(i-1)/2] +", ";
  }
  if((2*i+1) < list.length){
    combination = combination + "left key = " + list[2*i+1] + ", ";
  }
  if((2*i+2) < list.length){
    combination = combination + "right key = " + list[2*i+2] + ", ";
  }
  return combination;
 }
}
