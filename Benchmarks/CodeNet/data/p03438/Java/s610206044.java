import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] hai1=new int[n];
    int[] hai2=new int[n];
    int[] hai3=new int[n];
    boolean han=true;
    for(int i:hai1)
      hai1[i]=sc.nextInt();
    for(int i:hai2)
      hai2[i]=sc.nextInt();
    for(int i:hai3){
      if(hai1[i]>hai2[i]) hai3[i]=hai1[i]-hai2[i];
      else if(hai2[i]>hai1[i]) hai3[i]=hai2[i]-hai1[i];
      else hai3[i]==0;
    }
    for(int i:hai3)
      if(hai3[i]>1&&hai3[i]%2!=0)han=false;
    if(han==true) System.out.println("Yes");
    else System.out.println("No");
  }
}