import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

class Main{
  public static void main(String[] args){
    ArrayList<Integer> array = new ArrayList<Integer>();
    ArrayList<Integer> array2 = new ArrayList<Integer>();
    Scanner in = new Scanner(System.in);
    String n = in.nextLine();
    String[] str = n.split(" ");  
    Arrays.sort(str);
    //a < b
    int a = Integer.parseInt(str[0]);
    int b = Integer.parseInt(str[1]); 
    //System.out.println(Arrays.toString(str));
    //System.out.println(a);
    array.add(b);
    array.add(a);
    for (int i = 0; i < a; i++){
      array.add(Math.abs(array.get(i) - array.get(i + 1)));
    }
   // for (int s: array){
    //  System.out.println(s);
   // }
    for (int i = 0; i < a; i++){
      if (array.get(i) == 0){
        array2.add(i);
        }
      }
        //for (int s: array2){
       // System.out.println(s + "kk");
   // }
    int min = array.get(array2.get(0) - 1);
    int max = a * b / min;
    System.out.print(min + " " + max);
  }
}