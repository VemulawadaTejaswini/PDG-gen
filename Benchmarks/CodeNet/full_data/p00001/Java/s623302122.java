import java.util.*;

class Main{
 public static void main(String[] args){
  Scanner s = new Scanner(System.in);

 int []a = new int[10];
 for(int i=0; i<a.length; i++){
  a[i] = s.nextInt();
}
 Arrays.sort(a);
 for(int i=9; i>6; i--){
  System.out.println(a[i]);
}
}
}