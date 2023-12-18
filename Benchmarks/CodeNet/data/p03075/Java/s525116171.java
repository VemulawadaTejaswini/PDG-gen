import java.util.*;
class Five_Antennas{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    Integer[] antennas=new Integer[5];
    for(int i=0;i<5;i++){
      antennas[i]=scan.nextInt();
    }
    Arrays.sort(antennas,Collections.reverseOrder());
    int k=scan.nextInt();
    for(int i=0;i<5;i++){
      for(int j=i;j<5;j++){
        if(antennas[i]-antennas[j]>k){
          System.out.println(":(");
          System.exit(0);
        }
      }      
    }
    System.out.println("Yay!");
  }
}