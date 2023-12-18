import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int[] task=new int[3];
    for(int i=0;i<3;i++){
      task[i]=sc.nextInt();
    }
    Arrays.sort(task);
    int sum=0;
    for(int i=0;i<2;i++){
      sum+=task[i+1]-task[i];
    }
    System.out.println(sum);
  }
}