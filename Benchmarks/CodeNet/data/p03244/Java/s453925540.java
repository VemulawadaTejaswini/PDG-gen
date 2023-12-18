import java.util.Arrays;
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i;
    int[] v_1 = new int[n/2];
    int[] v_2 = new int[n/2];
    int total = 0;
    int M_1 = 0;
    int M_2 = 0;
    int Mnum_1 = 0;
    int Mnum_2 = 0;
    int mode_1 = 0;
    int mode_2 = 0;
    for(i=0;i<n/2;i++){
      v_1[i] = sc.nextInt();
      v_2[i] = sc.nextInt();
    }
    Arrays.sort(v_1);
    Arrays.sort(v_2);
    for(i=0;i<n/2;i++){
      if(i==0){
        M_1+=1;
      }else if(v_1[i]==v_1[i-1]){
        M_1+=1;
      }else{
        if(M_1>=Mnum_1){
          Mnum_1 = M_1;
          mode_1 = v_1[i];
          M_1 = 0;
        }else{
          M_1 = 0;
        }
      }
      if(M_1==n/2){
        mode_1 = v_1[i];
      }
      if(i==0){
        M_2+=1;
      }else if(v_2[i]==v_2[i-1]){
        M_2+=1;
      }else{
        if(M_2>=Mnum_2){
          Mnum_2 = M_2;
          mode_2 = v_2[i];
          M_2 = 0;
        }else{
          M_2 = 0;
        }
      }
      if(M_2==n/2){
        mode_2 = v_2[i];
      }
    }
    for(i=0;i<n/2;i++){
      if(v_1[i]!=mode_1){
        total += 1;
      }
      if(v_2[i]!=mode_2){
        total += 1;
      }
    }
    System.out.println(total);
  }
 }
