import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  int N=sc.nextInt();
  int[]NN={1,2,3,4,5,6,7,8,9,10,12,14,15,16,18,20,21,24,25,27,28,30,32,35,36,40,42,45,
           48,49,54,56,63,64,72,81};
  
  myLabel:for(int i=0;i<NN.length;i++){
if(NN[i]==N){
  System.out.println("Yes");
  break myLabel;
}else if(NN[35]!=N){
System.out.println("No");
}else{
}
  }
}
}
