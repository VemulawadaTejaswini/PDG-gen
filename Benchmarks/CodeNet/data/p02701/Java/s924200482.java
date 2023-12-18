import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
   Scanner kbd = new Scanner(System.in);
   int n=kbd.nextInt();
   String[] A= new String[n+1];
   for(int i=0;i<n;i++){
     A[i]=kbd.next();
}
  String[] B=new String[n+1];
  int a=1;
  int x=1;
  B[0]=A[0];
  for(int i=1;i<n;i++){
    for(int f=0;f<=a;f++){
    if(A[i].equals(B[f])){
    x=0;
    f=a+1;
}
}
if(x==1){
  B[a]=A[i];
  a=a+1;
}else{
  x=1;
}
}
System.out.println(a);
}
}
