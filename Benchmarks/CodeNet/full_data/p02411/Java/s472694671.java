import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> data1 = new ArrayList<Integer>();
    ArrayList<Integer> data2 = new ArrayList<Integer>();
    ArrayList<Integer> data3 = new ArrayList<Integer>();
    while(scanner.hasNextInt()){
      int m = scanner.nextInt();
      int f = scanner.nextInt();
      int r = scanner.nextInt();
      if(m == -1 && f == -1 && r == -1){
        break;
      }
      data1.add(m);
      data2.add(f);
      data3.add(r);
    }
    for(int i = 0; i < data1.size(); i++){
  if((data1.get(i) == -1 || data2.get(i) == -1) || (data1.get(i) + data2.get(i) < 30)){
    System.out.println("F");
  }
  if(data1.get(i) + data2.get(i) >= 80){
    System.out.println("A");
  }
  if(data1.get(i) + data2.get(i) >= 65 && data1.get(i) + data2.get(i) < 80){
    System.out.println("B");
  }
  if(data1.get(i) + data2.get(i) >= 30 && data1.get(i) + data2.get(i) < 50){
    System.out.println("D");
  }
  if((data1.get(i) + data2.get(i) >= 30 && data1.get(i) + data2.get(i) < 65) || ((data1.get(i) + data2.get(i) >= 30 && data1.get(i) + data2.get(i) <= 50) && data2.get(i) >= 50)){
    System.out.println("C");
  }

}
  }

}