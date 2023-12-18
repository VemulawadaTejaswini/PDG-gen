import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner (System.in);
    int B[]=new int[9];
    for(int i=0;i<9;i++){
        B[i]=sc.nextInt();}
    int N =sc.nextInt();
    int M[]=new int[N];
    Integer[] P=new Integer[10];
    for(int k=0;k<N;k++){
      M[k]=sc.nextInt();
      loop:for(int l=0;l<9;l++){
          if(M[k]==B[l]){P[k]=l+1;break loop;}}
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