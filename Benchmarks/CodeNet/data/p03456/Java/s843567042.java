import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[] ab=new int[2];
    for(int i=0;i<2;i++)
      ab[i]=sc.nextInt();
    int kari=ab[1];
    for(int i=0;kari==0;i++){
      ab[0]*=10;
      kari/=10;
    }
    double kari2=(double)ab[0]+(double)ab[1];
    double kari3=Math.sqrt(kari2);
    if(kari2==kari3*kari3)System.out.println("Yes");
    else System.out.println("No");
  }
}