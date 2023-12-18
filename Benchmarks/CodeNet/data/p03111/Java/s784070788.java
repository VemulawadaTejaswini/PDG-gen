import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int[] l = new int[n];
    for(int i=0;i<n;i++)l[i]=sc.nextInt();
    int min = (int)Math.pow(10,9);
    for(int i=0;i<=Math.pow(4,n)-1;i++){
      int sumA = 0;
      int cntA = 0;
      int sumB = 0;
      int cntB = 0;
      int sumC = 0;
      int cntC = 0;
      StringBuilder sb = new StringBuilder();
      String s = Integer.toString(i,4);
      for(int j=1;j<=n-s.length();j++)sb.append("0");
      sb.append(s);
      for(int j=0;j<sb.length();j++){
        if(sb.charAt(j)=='1'){
          sumA+=l[j];
          cntA++;
        }else if(sb.charAt(j)=='2'){
          sumB+=l[j];
          cntB++;
        }else if(sb.charAt(j)=='3'){
          sumC+=l[j];
          cntC++;
        }
      }
      if(sumA>0&&sumB>0&&sumC>0){
        int mp = (cntA-1)*10+(cntB-1)*10+(cntC-1)*10+Math.abs(a-sumA)+Math.abs(b-sumB)+Math.abs(c-sumC);
        min = Math.min(min,mp);
      }
    }
    System.out.println(min);
  }
}