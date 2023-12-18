import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    String line = sc.nextLine();
    char[] linec = line.toCharArray();
    int[] anums = new int[n];
    for(int i=0;i<n;i++)anums[i]=linec[i] - '1' + 1;
    for(int i=1;i<n;i++){
      for(int j=0;j<n-i;j++){
        anums[j] = Math.abs(anums[j]-anums[j+1]);
      }
    }
    System.out.println(""+anums[0]);
  }
}