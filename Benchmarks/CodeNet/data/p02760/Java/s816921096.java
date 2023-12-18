import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner (System.in);
    int B[][]=new int[3][3];
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        B[i][j]=sc.nextInt();}}
    int N =sc.nextInt();
    int M[]=new int[N];
    Integer[] P=new Integer[10];
    for(int k=0;k<N;k++){
      M[k]=sc.nextInt();
      loop:for(int l=0;l<3;l++){
        for(int m=0;m<3;m++){
          if(M[k]==B[l][m]){P[k]=3*l+m+1;break loop;}}}
    if(Arrays.asList(P).contains(1)){
        if(Arrays.asList(P).contains(2)&&Arrays.asList(P).contains(3)){System.out.println("Yes");System.exit(0);}
        else if(Arrays.asList(P).contains(4)&&Arrays.asList(P).contains(7)){System.out.println("Yes");System.exit(0);}
        else if(Arrays.asList(P).contains(5)&&Arrays.asList(P).contains(9)){System.out.println("Yes");System.exit(0);}}
      if(Arrays.asList(P).contains(5)){
        if(Arrays.asList(P).contains(2)&&Arrays.asList(P).contains(8)){System.out.println("Yes");System.exit(0);}
        if(Arrays.asList(P).contains(3)&&Arrays.asList(P).contains(7)){System.out.println("Yes");System.exit(0);}
        if(Arrays.asList(P).contains(4)&&Arrays.asList(P).contains(6)){System.out.println("Yes");System.exit(0);}}
      if(Arrays.asList(P).contains(9)){
        if(Arrays.asList(P).contains(3)&&Arrays.asList(P).contains(6)){System.out.println("Yes");System.exit(0);}
        if(Arrays.asList(P).contains(7)&&Arrays.asList(P).contains(8)){System.out.println("Yes");System.exit(0);}}}
    System.out.println("No");}
}